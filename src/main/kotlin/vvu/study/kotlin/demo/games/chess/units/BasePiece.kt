package vvu.study.kotlin.demo.games.chess.units

enum class Side {
    BLACK,
    WHITE
}

enum class PieceType {
    PAWN,
    BISHOP,
    KNIGHT,
    ROOK,
    QUEEN,
    KING
}

open class BasePiece private constructor(val type: PieceType, val site: Side) {

    lateinit var position: Position protected set

    constructor(type: PieceType, site: Side, position: Position) : this(type, site) {
        this.position = position
    }

}
