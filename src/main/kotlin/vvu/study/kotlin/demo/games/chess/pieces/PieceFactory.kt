package vvu.study.kotlin.demo.games.chess.pieces

import vvu.study.kotlin.demo.games.chess.units.PieceType
import vvu.study.kotlin.demo.games.chess.units.Position
import vvu.study.kotlin.demo.games.chess.units.Side

class PieceFactory {
    fun create(type: PieceType, site: Side, position: Position): Piece =
        when (type) {
            PieceType.PAWN -> Pawn(site = site, position = position)
            PieceType.BISHOP -> Bishop(site = site, position = position)
            PieceType.KNIGHT -> Knight(site = site, position = position)
            PieceType.ROOK -> Rook(site = site, position = position)
            PieceType.QUEEN -> Queen(site = site, position = position)
            PieceType.KING -> King(site = site, position = position)
        }
}