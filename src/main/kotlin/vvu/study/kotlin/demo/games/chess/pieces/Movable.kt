package vvu.study.kotlin.demo.games.chess.pieces

import vvu.study.kotlin.demo.games.chess.errors.IllegalArgumentError
import vvu.study.kotlin.demo.games.chess.units.*

operator fun Rank.plus(steps: Int): Rank = try {
    (this.value + steps).toRank()
} catch (e: Exception) {
    throw IllegalMovingStepError("Illegal horizontal Steps $steps from $this")
}

operator fun File.plus(steps: Int): File = try {
    (this.value + steps).toFile()
} catch (e: Exception) {
    throw IllegalMovingStepError("Illegal vertical Steps $steps from $this")
}

fun Position.move(horizontalSteps: Int, verticalSteps: Int): Position =
    Position(rank = this.rank + horizontalSteps, file = this.file + verticalSteps)

class IllegalMovingStepError : IllegalArgumentError {
    constructor() : super()
    constructor(message: String) : super(message)
    constructor(error: Throwable) : super(error)
}
