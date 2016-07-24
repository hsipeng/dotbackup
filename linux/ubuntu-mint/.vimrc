" Uncomment the next line to make Vim more Vi-compatible
" NOTE: debian.vim sets 'nocompatible'.  Setting 'compatible' changes numerous
" options, so any other options should be set AFTER setting 'compatible'.
"set compatible
set nocompatible
 
" Vim5 and later versions support syntax highlighting. Uncommenting the next
" line enables syntax highlighting by default.
if has("syntax")
  syntax on
endif
 
" If using a dark background within the editing area and syntax highlighting
" turn on this option as well
"set background=dark
 
" Uncomment the following to have Vim jump to the last position when
" reopening a file
"if has("autocmd")
"  au BufReadPost * if line("'\"") > 1 && line("'\"") <= line("$") | exe "normal! g'\"" | endif
"endif
 
" Uncomment the following to have Vim load indentation rules and plugins
" according to the detected filetype.
"if has("autocmd")
"  filetype plugin indent on
"endif
 
call pathogen#infect()
 
filetype plugin indent on
 
" The following are commented out as they cause vim to behave a lot
" differently from regular Vi. They are highly recommended though.
set showcmd     " Show (partial) command in status line.
"set showmatch      " Show matching brackets.
"set ignorecase     " Do case insensitive matching
set smartcase       " Do smart case matching
"set incsearch      " Incremental search
"set autowrite      " Automatically save before commands like :next and :make
"set hidden             " Hide buffers when they are abandoned
set mouse=a     " Enable mouse usage (all modes)
set nu
set tabstop=4
set softtabstop=4
" set shiftwidth=4
set expandtab           " use whitespace instead of tab
set autoindent
set smartindent
set cindent shiftwidth=4
" set autoindent shiftwidth=4
set foldmethod=indent
set backspace=indent,eol,start
set colorcolumn=80
 
 
" === tagbar setting =======
nmap <F4> :TagbarToggle<CR>   " shortcut
let g:tagbar_width = 20      " tagbar's width, default 20
autocmd VimEnter * nested :call tagbar#autoopen(1)  "automate to open tagbar
let g:tagbar_left = 1       " on the left side
"let g:tagbar_right = 1     " on the right side
let NERDTreeIgnore=['\.pyc', '\.pyo', '\.swp', '\~'] " ignore *.py[co], *.swp and *~
" =======end==================
 
" switch window
nnoremap <c-h> <c-w>h
nnoremap <c-j> <c-w>j
nnoremap <c-k> <c-w>k
nnoremap <c-l> <c-w>l
 
" ===== brace autocompletion =========
inoremap ( ()<Esc>i
inoremap [ []<Esc>i
inoremap { {<CR>}<Esc>O
autocmd Syntax html,vim inoremap < <lt>><Esc>i| inoremap > <c-r>=ClosePair('>')<CR>
inoremap ) <c-r>=ClosePair(')')<CR>
inoremap ] <c-r>=ClosePair(']')<CR>
inoremap } <c-r>=CloseBracket()<CR>
inoremap " <c-r>=QuoteDelim('"')<CR>
inoremap ' <c-r>=QuoteDelim("'")<CR>
 
function ClosePair(char)
 if getline('.')[col('.') - 1] == a:char
 return "\<Right>"
 else
 return a:char
 endif
endf
 
function CloseBracket()
 if match(getline(line('.') + 1), '\s*}') < 0
 return "\<CR>}"
 else
 return "\<Esc>j0f}a"
 endif
endf
 
function QuoteDelim(char)
 let line = getline('.')
 let col = col('.')
 if line[col - 2] == "\\"
 "Inserting a quoted quotation mark into the string
 return a:char
 elseif line[col - 1] == a:char
 "Escaping out of the string
 return "\<Right>"
 else
 "Starting a string
 return a:char.a:char."\<Esc>i"
 endif
endf
 
 
" Source a global configuration file if available
if filereadable("/etc/vim/vimrc.local")
    source /etc/vim/vimrc.local
endif
