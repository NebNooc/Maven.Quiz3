package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK"),
    PAPER("PAPER"),
    SCISSOR("SCISSOR");

    private String sign;
    RockPaperScissorHandSign(String sign) {
        this.sign = sign;
    }

    public RockPaperScissorHandSign getWinner() { return null;
    }

    public RockPaperScissorHandSign getLoser() {
        return null;
    }
}
