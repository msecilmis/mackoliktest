package msecilmis.com.mackoliktest.scores

import msecilmis.com.mackoliktest.networking.models.GetScoresResponse

class ScoresItemViewModel {

    var date: String
    var matches: List<MatchViewModel>

    constructor(date: String, matches: List<MatchViewModel>) {
        this.date = date
        this.matches = matches
    }

    companion object {
        fun convert(scoresResponse: GetScoresResponse): ScoresItemViewModel {
            var allMatches: MutableList<GetScoresResponse.Match> = ArrayList()
            scoresResponse.competition.season.round.group.forEach {
                it.match.forEach {
                    allMatches.add(it)
                }
            }

            return ScoresItemViewModel(allMatches.get(0).date_utc, MatchViewModel.convert(allMatches))
        }
    }

}