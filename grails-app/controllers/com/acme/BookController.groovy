package com.acme

class BookController {

    def bookService

    def index() { 
        bookService.doSomething()
        render(status: 200)
    }
}
