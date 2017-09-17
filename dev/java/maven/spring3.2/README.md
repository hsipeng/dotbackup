## spring3 mvean的项目搭建

主要目录结构如下

![]()



## 主要实现功能

 自动扫描com包下@service @controller @repositry注解.和自动扫描resouce/mappers/**/*.xml的mapperxml




## 实现原理

工具类 ApplicationContextUtil继承ApplicationContextAware,BeanNameAware,
实现自动装配.

然后在applicationContext.xml中引入,spirng加载时自动加载.

然后Dao层所有mapper继承BaseMapper.

BaseMapper继承自SqlSessionTemplate,初始化时,通过ApplicationContextUtil.getBean来加载

SqlSessionFactory.class,从而实现MapperImpl类的注解加载运行.从而可以扫描到@repositry注解下的内容.

最后是还实现了分页
实现原理时通过拦截器实现
具体代码在PageInterceptor.java.

在sqlMapConfig.xml中注入

```
<!-- mybatis分页拦截器 -->
    <plugins>
        <plugin interceptor="com.common.util.PageInterceptor"></plugin>
    </plugins>
```
具体处理逻辑如下:

普通的pojo类保留,然后重新见一个vo类,专门处理分页.

比如
```
OrderVo extends PageHelper<OrderPo> implements Serializable
```

OrderVo 根OrderPo类中所有属性一样,但是,因为继承了PageHelper.同事具有了PageHelper的属性,
属性如下:
```
/**
     * 页码，默认是第一页
     */
    private transient int pageNo = 1;
    /**
     * 每页显示的记录数，默认是10
     */
    private transient int pageSize = 10;
    /**
     * 总记录数
     */
    private int totalSize;
    /**
     * 总页数
     */
    private int pageCount;
    /**
     * 对应的当前页记录
     */
    private List<T> results;
```

每次分页结果自动存入results;

OrderServiceImpl.java代码如下:
```
List<OrderPo> results = orderMapper.findOrderByPage(orderVo);
        String code = results == null? "-1":"0";
        String msg = results == null? "error":"success";
        return new ResultHelper(code,msg,results,orderVo.getTotalSize(),orderVo.getPageNo(),orderVo.getPageSize());

```

