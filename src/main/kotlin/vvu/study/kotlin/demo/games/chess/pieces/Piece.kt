package vvu.study.kotlin.demo.games.chess.pieces

import vvu.study.kotlin.demo.games.chess.units.BasePiece
import vvu.study.kotlin.demo.games.chess.units.PieceType
import vvu.study.kotlin.demo.games.chess.units.Position
import vvu.study.kotlin.demo.games.chess.units.Side

abstract class Piece(
    type: PieceType,
    site: Side,
    position: Position
) : BasePiece(type, site, position), Scannable














