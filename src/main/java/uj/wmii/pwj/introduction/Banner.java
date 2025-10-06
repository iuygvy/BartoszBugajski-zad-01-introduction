package uj.wmii.pwj.introduction;

import java.util.HashMap;
import java.util.Map;

public class Banner {
    private static final int HEIGHT = 7;
    private static final Map<Character, String[]> BANNER = new HashMap<>();

    static{
        BANNER.put('Q', new String[]{
                " ##### ",
                "#     #",
                "#     #",
                "#     #",
                "#   # #",
                "#    # ",
                " #### #"
        });
        BANNER.put('W', new String[]{
                "#     #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                " ## ## "
        });
        BANNER.put('E', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#######"
        });
        BANNER.put('R', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#   #  ",
                "#    # ",
                "#     #"
        });
        BANNER.put('T', new String[]{
                "#######",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        BANNER.put('Y', new String[]{
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        BANNER.put('U', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " ##### "
        });
        BANNER.put('I', new String[]{
                "###",
                " # ",
                " # ",
                " # ",
                " # ",
                " # ",
                "###"
        });
        BANNER.put('O', new String[]{
                "#######",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#######"
        });
        BANNER.put('P', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#      ",
                "#      ",
                "#      "
        });
        BANNER.put('A', new String[]{
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #",
                "#######",
                "#     #",
                "#     #"
        });
        BANNER.put('S', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                " ##### ",
                "      #",
                "#     #",
                " ##### "
        });
        BANNER.put('D', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "###### "
        });
        BANNER.put('F', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#      "
        });
        BANNER.put('G', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#  ####",
                "#     #",
                "#     #",
                " ##### "
        });
        BANNER.put('H', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#######",
                "#     #",
                "#     #",
                "#     #"
        });
        BANNER.put('J', new String[]{
                "      #",
                "      #",
                "      #",
                "      #",
                "#     #",
                "#     #",
                " ##### "
        });
        BANNER.put('K', new String[]{
                "#    #",
                "#   # ",
                "#  #  ",
                "###   ",
                "#  #  ",
                "#   # ",
                "#    #"
        });
        BANNER.put('L', new String[]{
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#######"
        });
        BANNER.put('Z', new String[]{
                "#######",
                "     # ",
                "    #  ",
                "   #   ",
                "  #    ",
                " #     ",
                "#######"
        });
        BANNER.put('X', new String[]{
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #"
        });
        BANNER.put('C', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#      ",
                "#      ",
                "#     #",
                " ##### "
        });
        BANNER.put('V', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   "
        });
        BANNER.put('B', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#     #",
                "#     #",
                "###### "
        });
        BANNER.put('N', new String[]{
                "#     #",
                "##    #",
                "# #   #",
                "#  #  #",
                "#   # #",
                "#    ##",
                "#     #"
        });
        BANNER.put('M', new String[]{
                "#     #",
                "##   ##",
                "# # # #",
                "#  #  #",
                "#     #",
                "#     #",
                "#     #"
        });
        BANNER.put(' ', new String[]{
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        });
    }


    public String[] toBanner(String input) {
        if (input == null) return new String[0];

        input = input.toUpperCase();
        StringBuilder[] lines = new StringBuilder[HEIGHT];
        for (int i = 0; i < HEIGHT; i++) {
            lines[i] = new StringBuilder();
        }

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String[] letter = BANNER.get(c);
            for(int j = 0; j < HEIGHT; j++) {
                lines[j].append(letter[j]);
                if(c != ' ') lines[j].append(" ");
            }
        }

        String[] result = new String[HEIGHT];
        for(int i = 0; i < HEIGHT; i++) {
            result[i] = lines[i].toString();
        }

        return result;
    }
}
