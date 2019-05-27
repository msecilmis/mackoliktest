package msecilmis.com.mackoliktest.scores

import msecilmis.com.mackoliktest.networking.models.GetScoresResponse

class MatchViewModel {
    var teamAName: String
    var teamBName: String
    var teamAScore: String
    var teamBScore: String

    constructor(teamAName: String, teamBName: String, teamAScore: String, teamBScore: String) {
        this.teamAName = teamAName
        this.teamBName = teamBName
        this.teamAScore = teamAScore
        this.teamBScore = teamBScore
    }

    companion object {
        fun convert(matches: List<GetScoresResponse.Match>): List<MatchViewModel> {
            var result: MutableList<MatchViewModel> = ArrayList()
            matches.forEach {
                result.add(MatchViewModel(it.team_A_name, it.team_B_name, it.fs_A, it.fs_B))
            }

            return result
        }
    }
}