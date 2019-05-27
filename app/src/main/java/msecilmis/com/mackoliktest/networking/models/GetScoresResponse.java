package msecilmis.com.mackoliktest.networking.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "gsmrs")
public class GetScoresResponse {

    @Element(name = "method", required = false)
    private Method method;

    @Attribute(name = "last_generated", required = false)
    private String last_generated;

    @Element(name = "competition", required = false)
    private Competition competition;

    @Attribute(name = "lang", required = false)
    private String lang;

    @Attribute(name = "version", required = false)
    private String version;

    @Attribute(name = "sport", required = false)
    private String sport;

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getLast_generated() {
        return last_generated;
    }

    public void setLast_generated(String last_generated) {
        this.last_generated = last_generated;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public static class Method {

        @Attribute(name = "method_id", required = false)
        private String method_id;

        @ElementList(name = "parameter", required = false, entry = "parameter", inline = true)
        private List<Parameter> parameter;

        @Attribute(name = "name", required = false)
        private String name;

        public String getMethod_id() {
            return method_id;
        }

        public void setMethod_id(String method_id) {
            this.method_id = method_id;
        }

        public List<Parameter> getParameter() {
            return parameter;
        }

        public void setParameter(List<Parameter> parameter) {
            this.parameter = parameter;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Parameter {

        @Attribute(name = "name", required = false)
        private String name;

        @Attribute(name = "value", required = false)
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class Competition {
        @Attribute(name = "area_name", required = false)
        private String area_name;

        @Attribute(name = "last_updated", required = false)
        private String last_updated;

        @Attribute(name = "competition_id", required = false)
        private String competition_id;

        @Attribute(name = "name", required = false)
        private String name;

        @Attribute(name = "display_order", required = false)
        private String display_order;

        @Element(name = "season", required = false)
        private Season season;

        @Attribute(name = "type", required = false)
        private String type;

        @Attribute(name = "area_id", required = false)
        private String area_id;

        @Attribute(name = "teamtype", required = false)
        private String teamtype;

        @Attribute(name = "soccertype", required = false)
        private String soccertype;

        public String getArea_name() {
            return area_name;
        }

        public void setArea_name(String area_name) {
            this.area_name = area_name;
        }

        public String getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }

        public String getCompetition_id() {
            return competition_id;
        }

        public void setCompetition_id(String competition_id) {
            this.competition_id = competition_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplay_order() {
            return display_order;
        }

        public void setDisplay_order(String display_order) {
            this.display_order = display_order;
        }

        public Season getSeason() {
            return season;
        }

        public void setSeason(Season season) {
            this.season = season;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getArea_id() {
            return area_id;
        }

        public void setArea_id(String area_id) {
            this.area_id = area_id;
        }

        public String getTeamtype() {
            return teamtype;
        }

        public void setTeamtype(String teamtype) {
            this.teamtype = teamtype;
        }

        public String getSoccertype() {
            return soccertype;
        }

        public void setSoccertype(String soccertype) {
            this.soccertype = soccertype;
        }
    }

    public static class Season {
        @Attribute(name = "end_date", required = false)
        private String end_date;

        @Attribute(name = "last_updated", required = false)
        private String last_updated;

        @Element(name = "round", required = false)
        private Round round;

        @Attribute(name = "service_level", required = false)
        private String service_level;

        @Attribute(name = "name", required = false)
        private String name;

        @Attribute(name = "season_id", required = false)
        private String season_id;

        @Attribute(name = "start_date", required = false)
        private String start_date;

        public String getEnd_date() {
            return end_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public String getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }

        public Round getRound() {
            return round;
        }

        public void setRound(Round round) {
            this.round = round;
        }

        public String getService_level() {
            return service_level;
        }

        public void setService_level(String service_level) {
            this.service_level = service_level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSeason_id() {
            return season_id;
        }

        public void setSeason_id(String season_id) {
            this.season_id = season_id;
        }

        public String getStart_date() {
            return start_date;
        }

        public void setStart_date(String start_date) {
            this.start_date = start_date;
        }
    }

    public static class Round {
        @Attribute(name = "end_date", required = false)
        private String end_date;

        @Attribute(name = "round_id", required = false)
        private String round_id;

        @Attribute(name = "last_updated", required = false)
        private String last_updated;

        @Attribute(name = "name", required = false)
        private String name;

        @Attribute(name = "has_outgroup_matches", required = false)
        private String has_outgroup_matches;

        @Attribute(name = "groups", required = false)
        private String groups;

        @Attribute(name = "type", required = false)
        private String type;

        @Attribute(name = "start_date", required = false)
        private String start_date;

        @ElementList(name = "group", required = false, entry = "group", inline = true)
        private List<Group> group;

        public String getEnd_date() {
            return end_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public String getRound_id() {
            return round_id;
        }

        public void setRound_id(String round_id) {
            this.round_id = round_id;
        }

        public String getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHas_outgroup_matches() {
            return has_outgroup_matches;
        }

        public void setHas_outgroup_matches(String has_outgroup_matches) {
            this.has_outgroup_matches = has_outgroup_matches;
        }

        public String getGroups() {
            return groups;
        }

        public void setGroups(String groups) {
            this.groups = groups;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStart_date() {
            return start_date;
        }

        public void setStart_date(String start_date) {
            this.start_date = start_date;
        }

        public List<Group> getGroup() {
            return group;
        }

        public void setGroup(List<Group> group) {
            this.group = group;
        }

    }

    public static class Group {
        @Attribute(name = "last_updated", required = false)
        private String last_updated;

        @Attribute(name = "winner", required = false)
        private String winner;

        @Attribute(name = "group_id", required = false)
        private String group_id;

        @Attribute(name = "name", required = false)
        private String name;

        @ElementList(name = "match", required = false, entry = "match", inline = true)
        private List<Match> match;

        @Attribute(name = "details", required = false)
        private String details;

        public String getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }

        public String getWinner() {
            return winner;
        }

        public void setWinner(String winner) {
            this.winner = winner;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Match> getMatch() {
            return match;
        }

        public void setMatch(List<Match> match) {
            this.match = match;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }
    }

    public static class Match {
        @Attribute(name = "fs_B", required = false)
        private String fs_B;
        @Attribute(name = "time_utc", required = false)
        private String time_utc;
        @Attribute(name = "ets_B", required = false)
        private String ets_B;
        @Attribute(name = "last_updated", required = false)
        private String last_updated;
        @Attribute(name = "ets_A", required = false)
        private String ets_A;
        @Attribute(name = "date_london", required = false)
        private String date_london;
        @Attribute(name = "match_id", required = false)
        private String match_id;
        @Attribute(name = "team_B_name", required = false)
        private String team_B_name;
        @Attribute(name = "time_london", required = false)
        private String time_london;
        @Attribute(name = "ps_A", required = false)
        private String ps_A;
        @Attribute(name = "ps_B", required = false)
        private String ps_B;
        @Attribute(name = "date_utc", required = false)
        private String date_utc;
        @Attribute(name = "winner", required = false)
        private String winner;

        @Attribute(name = "team_A_id", required = false)
        private String team_A_id;

        @Attribute(name = "team_B_id", required = false)
        private String team_B_id;

        @Attribute(name = "hts_A", required = false)
        private String hts_A;

        @Attribute(name = "team_A_name", required = false)
        private String team_A_name;

        @Attribute(name = "team_B_country", required = false)
        private String team_B_country;

        @Attribute(name = "gameweek", required = false)
        private String gameweek;

        @Attribute(name = "hts_B", required = false)
        private String hts_B;

        @Attribute(name = "team_A_country", required = false)
        private String team_A_country;

        @Attribute(name = "status", required = false)
        private String status;

        @Attribute(name = "fs_A", required = false)
        private String fs_A;

        public String getFs_B() {
            return fs_B;
        }

        public void setFs_B(String fs_B) {
            this.fs_B = fs_B;
        }

        public String getTime_utc() {
            return time_utc;
        }

        public void setTime_utc(String time_utc) {
            this.time_utc = time_utc;
        }

        public String getEts_B() {
            return ets_B;
        }

        public void setEts_B(String ets_B) {
            this.ets_B = ets_B;
        }

        public String getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }

        public String getEts_A() {
            return ets_A;
        }

        public void setEts_A(String ets_A) {
            this.ets_A = ets_A;
        }

        public String getDate_london() {
            return date_london;
        }

        public void setDate_london(String date_london) {
            this.date_london = date_london;
        }

        public String getMatch_id() {
            return match_id;
        }

        public void setMatch_id(String match_id) {
            this.match_id = match_id;
        }

        public String getTeam_B_name() {
            return team_B_name;
        }

        public void setTeam_B_name(String team_B_name) {
            this.team_B_name = team_B_name;
        }

        public String getTime_london() {
            return time_london;
        }

        public void setTime_london(String time_london) {
            this.time_london = time_london;
        }

        public String getPs_A() {
            return ps_A;
        }

        public void setPs_A(String ps_A) {
            this.ps_A = ps_A;
        }

        public String getPs_B() {
            return ps_B;
        }

        public void setPs_B(String ps_B) {
            this.ps_B = ps_B;
        }

        public String getDate_utc() {
            return date_utc;
        }

        public void setDate_utc(String date_utc) {
            this.date_utc = date_utc;
        }

        public String getWinner() {
            return winner;
        }

        public void setWinner(String winner) {
            this.winner = winner;
        }

        public String getTeam_A_id() {
            return team_A_id;
        }

        public void setTeam_A_id(String team_A_id) {
            this.team_A_id = team_A_id;
        }

        public String getTeam_B_id() {
            return team_B_id;
        }

        public void setTeam_B_id(String team_B_id) {
            this.team_B_id = team_B_id;
        }

        public String getHts_A() {
            return hts_A;
        }

        public void setHts_A(String hts_A) {
            this.hts_A = hts_A;
        }

        public String getTeam_A_name() {
            return team_A_name;
        }

        public void setTeam_A_name(String team_A_name) {
            this.team_A_name = team_A_name;
        }

        public String getTeam_B_country() {
            return team_B_country;
        }

        public void setTeam_B_country(String team_B_country) {
            this.team_B_country = team_B_country;
        }

        public String getGameweek() {
            return gameweek;
        }

        public void setGameweek(String gameweek) {
            this.gameweek = gameweek;
        }

        public String getHts_B() {
            return hts_B;
        }

        public void setHts_B(String hts_B) {
            this.hts_B = hts_B;
        }

        public String getTeam_A_country() {
            return team_A_country;
        }

        public void setTeam_A_country(String team_A_country) {
            this.team_A_country = team_A_country;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getFs_A() {
            return fs_A;
        }

        public void setFs_A(String fs_A) {
            this.fs_A = fs_A;
        }
    }


}
