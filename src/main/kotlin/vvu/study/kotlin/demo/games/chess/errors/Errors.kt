package vvu.study.kotlin.demo.games.chess.errors

open class AppError : Exception {
    constructor() : super()
    constructor(message: String) : super(message)
    constructor(error: Throwable) : super(error)
}

open class IllegalArgumentError : AppError {
    constructor() : super()
    constructor(message: String) : super(message)
    constructor(error: Throwable) : super(error)
}