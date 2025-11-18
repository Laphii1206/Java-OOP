package w11;

public class W11_Enum {

    enum MEMES {
        LMFAO,
        DAMM,
        LOL
    }

    public static void main(String[] args) {
        MEMES meme = MEMES.LMFAO;
        switch (meme) {
            case LMFAO ->
                System.out.print("1");
            case DAMM ->
                System.out.print("2");
        }

    }
}
