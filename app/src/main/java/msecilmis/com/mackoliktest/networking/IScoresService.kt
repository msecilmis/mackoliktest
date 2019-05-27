package msecilmis.com.mackoliktest.networking

import msecilmis.com.mackoliktest.scores.ScoresItemViewModel

interface IScoresService {
    fun getScores(callback: IGetScoresCallback)

    interface IGetScoresCallback {
        fun onSuccess(scoresViewModel: ScoresItemViewModel)

        fun onFailure(errorMessage: String)
    }
}