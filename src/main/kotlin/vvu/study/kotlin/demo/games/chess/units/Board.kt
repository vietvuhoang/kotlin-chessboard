package vvu.study.kotlin.demo.games.chess.units

class Board {
    private val board: MutableMap<String, BasePiece> = mutableMapOf()

    fun put(piece: BasePiece) {
        board[piece.position.toString()] = piece
    }

    fun get(position: Position): BasePiece? = board[position.toString()]

    fun isBusy(position: Position): Boolean = board[position.toString()] === null
}