package Simulation;

import java.util.ArrayList;

/**
 * Class for the RB player.
 *
 * @author Achi
 */
public class PlayerRB extends Player {

    //RushPow affects how consistenly he can get past line of scrimmage
    public int ratRushPower;
    //RushSpd affects how long he can run
    public int ratSpeed;
    //RushEva affects how easily he can dodge tackles
    public int ratEvasion;
    public int ratCatch;

    //public Vector ratingsVector;

    //Stats
    public int statsRushAtt;
    public int statsRushYards;
    public int statsRushTD;
    public int statsFumbles;

    public int careerRushAtt;
    public int careerRushYards;
    public int careerTDs;
    public int careerFumbles;

    public int statsReceptions;
    public int statsRecYards;
    public int statsRecTD;

    public int careerReceptions;
    public int careerRecYards;
    public int careerRecTD;

    public int statsKickRets;
    public int statsKickRetYards;
    public int statsKickRetTDs;
    public int statsPuntRets;
    public int statsPuntRetYards;
    public int statsPuntRetTDs;
    public int statsRetGames;

    public int careerKickRets;
    public int careerKickRetYards;
    public int careerKickRetTDs;
    public int careerPuntRets;
    public int careerPuntRetYards;
    public int careerPuntRetTDs;
    public int careerRetGames;

    //Size Config
    private int hAvg = 71;
    private int hMax = 4;
    private int hMin = -4;
    private int wAvg = 215;
    private int wMax = 30;
    private int wMin = -20;

    public PlayerRB(Team t, String nm, int yr, int reg, int trait, int iq, int scout, boolean transfer, boolean wasRS, int pot, int dur, boolean rs, int pow, int spd, int eva, int cat, int h, int w) {
        team = t;
        name = nm;
        year = yr;
        gamesStarted = 0;
        gamesPlayed = 0;
        isInjured = false;
        ratOvr = (pow + spd + eva) / 3;
        ratPot = pot;
        ratFootIQ = iq;
        ratDur = dur;
        ratRushPower = pow;
        ratSpeed = spd;
        ratEvasion = eva;
        ratCatch = cat;
        isRedshirt = rs;
        if (isRedshirt) year = 0;
        wasRedshirt = wasRS;
        region = reg;
        personality = trait;
        troubledTimes = 0;
        recruitRating = scout;
        height = h;
        weight = w;

        statsRushAtt = 0;
        statsRushYards = 0;
        statsRushTD = 0;
        statsFumbles = 0;

        statsReceptions = 0;
        statsRecYards = 0;
        statsRecTD = 0;

        statsKickRets = 0;
        statsKickRetYards = 0;
        statsKickRetTDs = 0;
        statsPuntRets = 0;
        statsPuntRetYards = 0;
        statsPuntRetTDs = 0;
        statsRetGames = 0;

        careerKickRets = 0;
        careerKickRetYards = 0;
        careerKickRetTDs = 0;
        careerPuntRets = 0;
        careerPuntRetYards = 0;
        careerPuntRetTDs = 0;
        careerRetGames = 0;

        wonHeisman = false;
        wonAllAmerican = false;
        wonAllConference = false;
        wonAllFreshman = false;
        wonTopFreshman = false;

        statsWins = 0;

        careerRushAtt = 0;
        careerRushYards = 0;
        careerTDs = 0;
        careerFumbles = 0;
        careerReceptions = 0;
        careerRecYards = 0;
        careerRecTD = 0;
        careerGames = 0;
        careerHeismans = 0;
        careerAllAmerican = 0;
        careerAllConference = 0;
        careerAllFreshman = 0;
        careerTopFreshman = 0;
        careerWins = 0;

        position = "RB";
    }

    public PlayerRB(Team t, String nm, int yr, int reg, int trait, int iq, int scout, boolean transfer, boolean wasRS, boolean wo, int pot, int dur, boolean rs, int cGamesPlayed, int cWins, int cHeismans, int cAA, int cAC, int cTF, int cAF,
                    int pow, int spd, int eva, int cat, int h, int w, int cRushAtt, int cRushYards, int cTDs, int cFumbles, int cRec, int cRecYards, int cRecTD, int kret, int kyds, int ktd, int pret, int pyds, int ptd) {
        team = t;
        name = nm;
        year = yr;
        gamesStarted = 0;
        gamesPlayed = 0;
        isInjured = false;
        ratOvr = (pow + spd + eva) / 3;
        ratPot = pot;
        ratFootIQ = iq;
        ratDur = dur;
        ratRushPower = pow;
        ratSpeed = spd;
        ratEvasion = eva;
        ratCatch = cat;
        isRedshirt = rs;
        if (isRedshirt) year = 0;
        wasRedshirt = wasRS;
        isTransfer = transfer;
        isWalkOn = wo;
        region = reg;
        personality = trait;
        recruitRating = scout;
        height = h;
        weight = w;

        troubledTimes = 0;

        statsRushAtt = 0;
        statsRushYards = 0;
        statsRushTD = 0;
        statsFumbles = 0;

        statsReceptions = 0;
        statsRecYards = 0;
        statsRecTD = 0;

        statsKickRets = 0;
        statsKickRetYards = 0;
        statsKickRetTDs = 0;
        statsPuntRets = 0;
        statsPuntRetYards = 0;
        statsPuntRetTDs = 0;
        statsRetGames = 0;

        wonHeisman = false;
        wonAllAmerican = false;
        wonAllConference = false;
        wonAllFreshman = false;
        wonTopFreshman = false;

        statsWins = 0;

        careerRushAtt = cRushAtt;
        careerRushYards = cRushYards;
        careerTDs = cTDs;
        careerFumbles = cFumbles;
        careerReceptions = cRec;
        careerRecYards = cRecYards;
        careerRecTD = cRecTD;
        careerGames = cGamesPlayed;
        careerHeismans = cHeismans;
        careerAllAmerican = cAA;
        careerAllConference = cAC;
        careerTopFreshman = cTF;
        careerAllFreshman = cAF;
        careerWins = cWins;

        careerKickRets = kret;
        careerKickRetYards = kyds;
        careerKickRetTDs = ktd;
        careerPuntRets = pret;
        careerPuntRetYards = pyds;
        careerPuntRetTDs = ptd;

        position = "RB";
    }

    public PlayerRB(String nm, int yr, int stars, Team t) {
        name = nm;
        year = yr;
        team = t;
        gamesStarted = 0;
        gamesPlayed = 0;
        isInjured = false;
        ratPot = (int) (attrBase + 50 * Math.random());
        ratFootIQ = (int) (attrBase + 50 * Math.random());
        ratDur = (int) (attrBase + 50 * Math.random());
        ratRushPower = (int) (ratBase + year * yearFactor + stars * starFactor - ratTolerance * Math.random());
        ratSpeed = (int) (ratBase + year * yearFactor + stars * starFactor - ratTolerance * Math.random());
        ratEvasion = (int) (ratBase + year * yearFactor + stars * starFactor - ratTolerance * Math.random());
        ratCatch = (int) ((ratBase - 15) + year * yearFactor + stars * starFactor - ratTolerance * Math.random());
        ratOvr = (ratRushPower + ratSpeed + ratEvasion) / 3;
        region = (int) (Math.random() * 5);
        personality = (int) (attrBase + 50 * Math.random());
        recruitRating = getScoutingGrade();

        recruitTolerance = (int) ((60 - team.teamPrestige) / rbImportance);
        cost = (int) ((Math.pow((float) ratOvr - costBaseRating, 2) / 5) + (int) Math.random() * recruitTolerance);

        cost = (int) (cost / rbImportance);

        double locFactor = Math.abs(team.location - region) - 2.5;
        cost = cost + (int) (Math.random() * (locFactor * locationDiscount));
        if (cost < 0) cost = (int) Math.random() * 7 + 1;

        troubledTimes = 0;

        statsRushAtt = 0;
        statsRushYards = 0;
        statsRushTD = 0;
        statsFumbles = 0;

        statsReceptions = 0;
        statsRecYards = 0;
        statsRecTD = 0;

        statsKickRets = 0;
        statsKickRetYards = 0;
        statsKickRetTDs = 0;
        statsPuntRets = 0;
        statsPuntRetYards = 0;
        statsPuntRetTDs = 0;
        statsRetGames = 0;

        wonHeisman = false;
        wonAllAmerican = false;
        wonAllConference = false;
        wonAllFreshman = false;
        wonTopFreshman = false;

        statsWins = 0;

        careerRushAtt = 0;
        careerRushYards = 0;
        careerTDs = 0;
        careerFumbles = 0;
        careerGames = 0;
        careerHeismans = 0;
        careerAllAmerican = 0;
        careerAllConference = 0;
        careerAllFreshman = 0;
        careerTopFreshman = 0;
        careerWins = 0;

        careerKickRets = 0;
        careerKickRetYards = 0;
        careerKickRetTDs = 0;
        careerPuntRets = 0;
        careerPuntRetYards = 0;
        careerPuntRetTDs = 0;
        careerRetGames = 0;

        position = "RB";
        height = hAvg + (int) (Math.random() * ((hMax - hMin) + 1)) + hMin;
        weight = wAvg + (int) (Math.random() * ((wMax - wMin) + 1)) + wMin;
    }

    public PlayerRB(String nm, int yr, int stars, Team t, boolean custom) {
        name = nm;
        year = yr;
        team = t;
        gamesStarted = 0;
        gamesPlayed = 0;
        isInjured = false;
        ratPot = (int) (attrBase + 50 * Math.random());
        ratFootIQ = (int) (attrBase + 50 * Math.random());
        ratDur = (int) (attrBase + 50 * Math.random());
        ratRushPower = (int) (ratBase + stars * customFactor - ratTolerance * Math.random());
        ratSpeed = (int) (ratBase + stars * customFactor - ratTolerance * Math.random());
        ratEvasion = (int) (ratBase + stars * customFactor - ratTolerance * Math.random());
        ratCatch = (int) ((ratBase - 15) + stars * customFactor - ratTolerance * Math.random());
        ratOvr = (ratRushPower + ratSpeed + ratEvasion) / 3;
        region = (int) (Math.random() * 5);
        personality = (int) (attrBase + 50 * Math.random());

        if(custom) isWalkOn = true;
        recruitRating = getScoutingGrade();

        troubledTimes = 0;

        statsRushAtt = 0;
        statsRushYards = 0;
        statsRushTD = 0;
        statsFumbles = 0;

        statsReceptions = 0;
        statsRecYards = 0;
        statsRecTD = 0;

        statsKickRets = 0;
        statsKickRetYards = 0;
        statsKickRetTDs = 0;
        statsPuntRets = 0;
        statsPuntRetYards = 0;
        statsPuntRetTDs = 0;
        statsRetGames = 0;

        wonHeisman = false;
        wonAllAmerican = false;
        wonAllConference = false;
        wonAllFreshman = false;
        wonTopFreshman = false;
        statsWins = 0;

        careerRushAtt = 0;
        careerRushYards = 0;
        careerTDs = 0;
        careerFumbles = 0;
        careerGames = 0;
        careerHeismans = 0;
        careerAllAmerican = 0;
        careerAllConference = 0;
        careerAllFreshman = 0;
        careerTopFreshman = 0;
        careerWins = 0;

        careerKickRets = 0;
        careerKickRetYards = 0;
        careerKickRetTDs = 0;
        careerPuntRets = 0;
        careerPuntRetYards = 0;
        careerPuntRetTDs = 0;
        careerRetGames = 0;

        position = "RB";
        height = hAvg + (int) (Math.random() * ((hMax - hMin) + 1)) + hMin;
        weight = wAvg + (int) (Math.random() * ((wMax - wMin) + 1)) + wMin;
    }

    @Override
    public void advanceSeason() {
        int oldOvr = ratOvr;
        progression = (ratPot * 3 + team.HC.get(0).ratTalent * 2 + team.HC.get(0).ratOff) / 6;
        int games = gamesStarted + (gamesPlayed - gamesStarted) / 3;

        if (!isMedicalRS) {
            year++;
            if (wonAllConference) ratPot += (int) Math.random() * allConfPotBonus;
            if (wonAllAmerican) ratPot += (int) Math.random() * allAmericanBonus;
            if (wonAllFreshman) ratPot += (int)Math.random()*allFreshmanBonus;
            if (wonTopFreshman) ratPot += (int)Math.random()*topBonus;
            if (wonHeisman) ratPot += (int)Math.random()*topBonus;

            if (year > 2 && games < minGamesPot) ratPot -= (int) (Math.random() * 15);

            ratFootIQ += (int) (Math.random() * (progression + games - 35)) / 10;
            ratRushPower += (int) (Math.random() * (progression + games - 35)) / 10;
            ratSpeed += (int) (Math.random() * (progression + games - 35)) / 10;
            ratEvasion += (int) (Math.random() * (progression + games - 35)) / 10;
            ratCatch += (int) (Math.random() * (progression + games - 30)) / 10;
            if (Math.random() * 100 < progression) {
                //breakthrough
                ratRushPower += (int) (Math.random() * (progression + games - 40)) / 10;
                ratSpeed += (int) (Math.random() * (progression + games - 40)) / 10;
                ratEvasion += (int) (Math.random() * (progression + games - 40)) / 10;
                ratCatch += (int) (Math.random() * (progression + games - 35)) / 10;
            }
        }
        ratOvr = (ratRushPower + ratSpeed + ratEvasion) / 3;
        ratImprovement = ratOvr - oldOvr;
        //reset stats (keep career stats?)
        careerRushAtt += statsRushAtt;
        careerRushYards += statsRushYards;
        careerTDs += statsRushTD;
        careerFumbles += statsFumbles;
        careerReceptions += statsReceptions;
        careerRecYards += statsRecYards;
        careerRecTD += statsRecTD;
        careerGames += gamesPlayed;
        careerWins += statsWins;

        careerKickRets += statsKickRets;
        careerKickRetYards += statsKickRetYards;
        careerKickRetTDs += statsKickRetTDs;
        careerPuntRets += statsPuntRets;
        careerPuntRetYards += statsPuntRetYards;
        careerPuntRetTDs += statsPuntRetTDs;
        careerRetGames += statsRetGames;

        if (wonHeisman) careerHeismans++;
        if (wonAllAmerican) careerAllAmerican++;
        if (wonAllConference) careerAllConference++;
        if (wonAllFreshman) careerAllFreshman++;
        if (wonTopFreshman) careerTopFreshman++;

        statsRushAtt = 0;
        statsRushYards = 0;
        statsRushTD = 0;
        statsFumbles = 0;
        statsReceptions = 0;
        statsRecYards = 0;
        statsRecTD = 0;

        statsKickRets = 0;
        statsKickRetYards = 0;
        statsKickRetTDs = 0;
        statsPuntRets = 0;
        statsPuntRetYards = 0;
        statsPuntRetTDs = 0;
        statsRetGames = 0;

        if (isTransfer) {
            isTransfer = false;
            year -= 1;
        }

        if (isRedshirt) wasRedshirt = true;

    }

    @Override
    public int getHeismanScore() {
        return statsRushTD * 150 - statsFumbles * 75 + (int) (statsRushYards * 3.25) + 2 * statsReceptions + (int) (statsRecYards * 2.65) + statsRecTD * 150 + statsKickRetYards + statsKickRetTDs * 150 + statsPuntRetYards + statsPuntRetTDs * 150 + ratOvr * 10 + team.teamPrestige * 3 + team.confPrestige * 3 + (120 - team.rankTeamPollScore) * 2;
    }

    @Override
    public int getCareerScore() {
        return statsRushTD * 150 - statsFumbles * 75 + (int) (statsRushYards * 3.25) + 2 * statsReceptions + (int) (statsRecYards * 2.65) + statsRecTD * 150 + ratOvr * 10
                + careerTDs * 150 - careerFumbles * 75 + (int) (careerRushYards * 3.25) + 2 * careerReceptions + (int) (careerRecYards * 2.65) + careerRecTD * 150 + statsKickRetYards + statsKickRetTDs * 150
                + statsPuntRetYards + statsPuntRetTDs * 150 + careerKickRetYards + careerKickRetTDs * 150 + careerPuntRetYards + careerPuntRetTDs * 150 + ratOvr * 10 * year;
    }

    public double getCareerYardsperCarry() {
        if (careerRushAtt < 1) {
            return 0;
        } else {
            double rating = (statsRushYards + careerRushYards) / (statsRushAtt + careerRushAtt);
            return rating;
        }
    }

    public double getYardsperCarry() {
        if (statsRushAtt < 1) {
            return 0;
        } else {
            double rating = (double) (statsRushYards) / (statsRushAtt);
            return rating;
        }
    }

    @Override
    public ArrayList<String> getDetailStatsList(int games) {
        ArrayList<String> pStats = new ArrayList<>();
        pStats.add("Height " + getHeight() + ">Weight: " + getWeight());
        pStats.add("Rush TDs: " + statsRushTD + ">Fumbles: " + statsFumbles);
        pStats.add("Rush Yards: " + statsRushYards + " yds>Yards/Att: " + df2.format(getYardsperCarry()) + " yds");
        pStats.add("Yds/Game: " + df2.format((double) (statsRushYards / getGames())) + " yds/g>Rush Att: " + statsRushAtt);
        pStats.add("Rec Yards: " + statsRecYards + " yds>Receptions: " + statsReceptions + " ");
        pStats.add("Rec TDs: " + statsRecTD + ">Games: " + gamesPlayed + " (" + statsWins + "-" + (gamesStarted - statsWins) + ")");
        if (statsKickRets > 0) {
            pStats.add("Kick Rets: " + statsKickRets + ">Kick Ret Yards: " + statsKickRetYards + " yrds");
            pStats.add("Kick Ret TDs: " + statsKickRetTDs + ">Ret Avg: " + (double) (statsKickRetYards / statsKickRets));
        }
        if (statsPuntRets > 0) {
            pStats.add("Punt Rets: " + statsPuntRets + ">Punt Ret Yards: " + statsPuntRetYards + " yrds");
            pStats.add("Punt Ret TDs: " + statsPuntRetTDs + ">Ret Avg: " + (double) (statsPuntRetYards / statsPuntRets));
        }
        pStats.add("Rush Speed: " + getLetterGrade(ratSpeed) + ">Rush Power: " + getLetterGrade(ratRushPower));
        pStats.add("Catching: " + getLetterGrade(ratCatch) + ">Evasion: " + getLetterGrade(ratEvasion));
        pStats.add("Durability: " + getLetterGrade(ratDur) + ">Football IQ: " + getLetterGrade(ratFootIQ));
        pStats.add("Home Region: " + getRegion(region) + ">Personality: " + getLetterGrade(personality));
        pStats.add("Scout Grade: " + getScoutingGradeString() + " > " + getStatus());
        pStats.add(" > ");
        return pStats;
    }

    @Override
    public ArrayList<String> getDetailAllStatsList(int games) {
        ArrayList<String> pStats = new ArrayList<>();
        pStats.add("Height " + getHeight() + ">Weight: " + getWeight());
        pStats.add("TDs: " + statsRushTD + ">Fumbles: " + statsFumbles);
        pStats.add("Rush Yards: " + statsRushYards + " yds>Yards/Att: " + df2.format(getYardsperCarry()) + " yds");
        pStats.add("Yds/Game: " + df2.format((double) (statsRushYards / getGames())) + " yds/g>Rush Att: " + statsRushAtt);
        pStats.add("Rec Yards: " + statsRecYards + " yds>Receptions: " + statsReceptions + " ");
        pStats.add("Rec TDs: " + statsRecTD + ">Games: " + gamesPlayed + " (" + statsWins + "-" + (gamesStarted - statsWins) + ")");
        if (statsKickRets > 0) {
            pStats.add("Kick Rets: " + statsKickRets + ">Kick Ret Yards: " + statsKickRetYards + " yrds");
            pStats.add("Kick Ret TDs: " + statsKickRetTDs + ">Ret Avg: " + (double) (statsKickRetYards / statsKickRets));
        }
        if (statsPuntRets > 0) {
            pStats.add("Punt Rets: " + statsPuntRets + ">Punt Ret Yards: " + statsPuntRetYards + " yrds");
            pStats.add("Punt Ret TDs: " + statsPuntRetTDs + ">Ret Avg: " + (double) (statsPuntRetYards / statsPuntRets));
        }
        pStats.add("Rush Speed: " + getLetterGrade(ratSpeed) + ">Rush Power: " + getLetterGrade(ratRushPower));
        pStats.add("Catching: " + getLetterGrade(ratCatch) + ">Evasion: " + getLetterGrade(ratEvasion));
        pStats.add("Durability: " + getLetterGrade(ratDur) + ">Football IQ: " + getLetterGrade(ratFootIQ));
        pStats.add("Home Region: " + getRegion(region) + ">Personality: " + getLetterGrade(personality));
        pStats.add("Scout Grade: " + getScoutingGradeString() + " > " + getStatus());
        pStats.add(" > ");
        pStats.add("[B]CAREER STATS:");
        pStats.addAll(getCareerStatsList());
        return pStats;
    }

    @Override
    public ArrayList<String> getCareerStatsList() {
        ArrayList<String> pStats = new ArrayList<>();
        pStats.add("TDs: " + (statsRushTD + careerTDs) + ">Fumbles: " + (statsFumbles + careerFumbles));
        pStats.add("Rush Yards: " + (statsRushYards + careerRushYards) + " yds>Yards/Att: " + df2.format(getCareerYardsperCarry()) + " yds");
        pStats.add("Yds/Game: " + df2.format((double) ((statsRushYards + careerRushYards) / (getGames() + careerGames))) + " yds/g>Rush Att: " + (statsRushAtt + careerRushAtt));
        pStats.add("Rec Yards: " + (statsRecYards + careerRecYards) + " yds>Receptions: " + (statsReceptions + careerReceptions) + " ");
        pStats.add("Rec TDs: " + (statsRecTD + careerRecTD) + "> ");
        if (statsKickRets + careerKickRets > 0) {
            pStats.add("Kick Rets: " + (statsKickRets + careerKickRets) + ">Kick Ret Yards: " + (statsKickRetYards + careerKickRetYards) + " yrds");
            pStats.add("Kick Ret TDs: " + (statsKickRetTDs + careerKickRetTDs) + ">Ret Avg: " + (double) ((statsKickRetYards + careerKickRetYards) / (statsKickRets + careerKickRets)));
        }
        if (statsPuntRets + careerPuntRets > 0) {
            pStats.add("Punt Rets: " + (statsPuntRets + careerPuntRets) + ">Punt Ret Yards: " + (statsPuntRetYards + careerPuntRetYards) + " yrds");
            pStats.add("Punt Ret TDs: " + (statsPuntRetTDs + careerPuntRetTDs) + ">Ret Avg: " + (double) ((statsPuntRetYards + careerPuntRetYards) / (statsPuntRets + careerPuntRets)));
        }
        pStats.addAll(super.getCareerStatsList());
        return pStats;
    }

    @Override
    public String getInfoForLineup() {
        if (injury != null)
            return getInitialName() + " [" + getYrStr() + "] " + ratOvr + "/" + getPotRating(ratPot, ratOvr, year, team.HC.get(0).ratTalent) + " " + injury.toString();
        return getInitialName() + " [" + getYrStr() + "] " + ratOvr + "/" + getPotRating(ratPot, ratOvr, year, team.HC.get(0).ratTalent) + " (" +
                getLetterGrade(ratRushPower) + ", " + getLetterGrade(ratSpeed) + ", " + getLetterGrade(ratEvasion) + ", " + getLetterGrade(ratCatch) + ")";
    }

}
