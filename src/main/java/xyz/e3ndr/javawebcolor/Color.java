package xyz.e3ndr.javawebcolor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Color {
    private static final Map<String, Color> cssColors = new HashMap<>();

    private float red;
    private float green;
    private float blue;
    private float alpha;

    // Sources:
    // https://raw.githubusercontent.com/bahamas10/css-color-names/master/css-color-names.json
    // https://en.wikipedia.org/wiki/Web_colors
    static {
        cssColors.put("aliceblue", new Color("#f0f8ff"));
        cssColors.put("antiquewhite", new Color("#faebd7"));
        cssColors.put("aqua", new Color("#00ffff"));
        cssColors.put("aquamarine", new Color("#7fffd4"));
        cssColors.put("azure", new Color("#f0ffff"));
        cssColors.put("beige", new Color("#f5f5dc"));
        cssColors.put("bisque", new Color("#ffe4c4"));
        cssColors.put("black", new Color("#000000"));
        cssColors.put("blanchedalmond", new Color("#ffebcd"));
        cssColors.put("blue", new Color("#0000ff"));
        cssColors.put("blueviolet", new Color("#8a2be2"));
        cssColors.put("brown", new Color("#a52a2a"));
        cssColors.put("burlywood", new Color("#deb887"));
        cssColors.put("cadetblue", new Color("#5f9ea0"));
        cssColors.put("chartreuse", new Color("#7fff00"));
        cssColors.put("chocolate", new Color("#d2691e"));
        cssColors.put("coral", new Color("#ff7f50"));
        cssColors.put("cornflowerblue", new Color("#6495ed"));
        cssColors.put("cornsilk", new Color("#fff8dc"));
        cssColors.put("crimson", new Color("#dc143c"));
        cssColors.put("cyan", new Color("#00ffff"));
        cssColors.put("darkblue", new Color("#00008b"));
        cssColors.put("darkcyan", new Color("#008b8b"));
        cssColors.put("darkgoldenrod", new Color("#b8860b"));
        cssColors.put("darkgray", new Color("#a9a9a9"));
        cssColors.put("darkgreen", new Color("#006400"));
        cssColors.put("darkgrey", new Color("#a9a9a9"));
        cssColors.put("darkkhaki", new Color("#bdb76b"));
        cssColors.put("darkmagenta", new Color("#8b008b"));
        cssColors.put("darkolivegreen", new Color("#556b2f"));
        cssColors.put("darkorange", new Color("#ff8c00"));
        cssColors.put("darkorchid", new Color("#9932cc"));
        cssColors.put("darkred", new Color("#8b0000"));
        cssColors.put("darksalmon", new Color("#e9967a"));
        cssColors.put("darkseagreen", new Color("#8fbc8f"));
        cssColors.put("darkslateblue", new Color("#483d8b"));
        cssColors.put("darkslategray", new Color("#2f4f4f"));
        cssColors.put("darkslategrey", new Color("#2f4f4f"));
        cssColors.put("darkturquoise", new Color("#00ced1"));
        cssColors.put("darkviolet", new Color("#9400d3"));
        cssColors.put("deeppink", new Color("#ff1493"));
        cssColors.put("deepskyblue", new Color("#00bfff"));
        cssColors.put("dimgray", new Color("#696969"));
        cssColors.put("dimgrey", new Color("#696969"));
        cssColors.put("dodgerblue", new Color("#1e90ff"));
        cssColors.put("firebrick", new Color("#b22222"));
        cssColors.put("floralwhite", new Color("#fffaf0"));
        cssColors.put("forestgreen", new Color("#228b22"));
        cssColors.put("fuchsia", new Color("#ff00ff"));
        cssColors.put("gainsboro", new Color("#dcdcdc"));
        cssColors.put("ghostwhite", new Color("#f8f8ff"));
        cssColors.put("goldenrod", new Color("#daa520"));
        cssColors.put("gold", new Color("#ffd700"));
        cssColors.put("gray", new Color("#808080"));
        cssColors.put("green", new Color("#008000"));
        cssColors.put("greenyellow", new Color("#adff2f"));
        cssColors.put("grey", new Color("#808080"));
        cssColors.put("honeydew", new Color("#f0fff0"));
        cssColors.put("hotpink", new Color("#ff69b4"));
        cssColors.put("indianred", new Color("#cd5c5c"));
        cssColors.put("indigo", new Color("#4b0082"));
        cssColors.put("ivory", new Color("#fffff0"));
        cssColors.put("khaki", new Color("#f0e68c"));
        cssColors.put("lavenderblush", new Color("#fff0f5"));
        cssColors.put("lavender", new Color("#e6e6fa"));
        cssColors.put("lawngreen", new Color("#7cfc00"));
        cssColors.put("lemonchiffon", new Color("#fffacd"));
        cssColors.put("lightblue", new Color("#add8e6"));
        cssColors.put("lightcoral", new Color("#f08080"));
        cssColors.put("lightcyan", new Color("#e0ffff"));
        cssColors.put("lightgoldenrodyellow", new Color("#fafad2"));
        cssColors.put("lightgray", new Color("#d3d3d3"));
        cssColors.put("lightgreen", new Color("#90ee90"));
        cssColors.put("lightgrey", new Color("#d3d3d3"));
        cssColors.put("lightpink", new Color("#ffb6c1"));
        cssColors.put("lightsalmon", new Color("#ffa07a"));
        cssColors.put("lightseagreen", new Color("#20b2aa"));
        cssColors.put("lightskyblue", new Color("#87cefa"));
        cssColors.put("lightslategray", new Color("#778899"));
        cssColors.put("lightslategrey", new Color("#778899"));
        cssColors.put("lightsteelblue", new Color("#b0c4de"));
        cssColors.put("lightyellow", new Color("#ffffe0"));
        cssColors.put("lime", new Color("#00ff00"));
        cssColors.put("limegreen", new Color("#32cd32"));
        cssColors.put("linen", new Color("#faf0e6"));
        cssColors.put("magenta", new Color("#ff00ff"));
        cssColors.put("maroon", new Color("#800000"));
        cssColors.put("mediumaquamarine", new Color("#66cdaa"));
        cssColors.put("mediumblue", new Color("#0000cd"));
        cssColors.put("mediumorchid", new Color("#ba55d3"));
        cssColors.put("mediumpurple", new Color("#9370db"));
        cssColors.put("mediumseagreen", new Color("#3cb371"));
        cssColors.put("mediumslateblue", new Color("#7b68ee"));
        cssColors.put("mediumspringgreen", new Color("#00fa9a"));
        cssColors.put("mediumturquoise", new Color("#48d1cc"));
        cssColors.put("mediumvioletred", new Color("#c71585"));
        cssColors.put("midnightblue", new Color("#191970"));
        cssColors.put("mintcream", new Color("#f5fffa"));
        cssColors.put("mistyrose", new Color("#ffe4e1"));
        cssColors.put("moccasin", new Color("#ffe4b5"));
        cssColors.put("navajowhite", new Color("#ffdead"));
        cssColors.put("navy", new Color("#000080"));
        cssColors.put("oldlace", new Color("#fdf5e6"));
        cssColors.put("olive", new Color("#808000"));
        cssColors.put("olivedrab", new Color("#6b8e23"));
        cssColors.put("orange", new Color("#ffa500"));
        cssColors.put("orangered", new Color("#ff4500"));
        cssColors.put("orchid", new Color("#da70d6"));
        cssColors.put("palegoldenrod", new Color("#eee8aa"));
        cssColors.put("palegreen", new Color("#98fb98"));
        cssColors.put("paleturquoise", new Color("#afeeee"));
        cssColors.put("palevioletred", new Color("#db7093"));
        cssColors.put("papayawhip", new Color("#ffefd5"));
        cssColors.put("peachpuff", new Color("#ffdab9"));
        cssColors.put("peru", new Color("#cd853f"));
        cssColors.put("pink", new Color("#ffc0cb"));
        cssColors.put("plum", new Color("#dda0dd"));
        cssColors.put("powderblue", new Color("#b0e0e6"));
        cssColors.put("purple", new Color("#800080"));
        cssColors.put("rebeccapurple", new Color("#663399")); // <3
                                                              // https://medium.com/@valgaze/the-hidden-purple-memorial-in-your-web-browser-7d84813bb416
        cssColors.put("red", new Color("#ff0000"));
        cssColors.put("rosybrown", new Color("#bc8f8f"));
        cssColors.put("royalblue", new Color("#4169e1"));
        cssColors.put("saddlebrown", new Color("#8b4513"));
        cssColors.put("salmon", new Color("#fa8072"));
        cssColors.put("sandybrown", new Color("#f4a460"));
        cssColors.put("seagreen", new Color("#2e8b57"));
        cssColors.put("seashell", new Color("#fff5ee"));
        cssColors.put("sienna", new Color("#a0522d"));
        cssColors.put("silver", new Color("#c0c0c0"));
        cssColors.put("skyblue", new Color("#87ceeb"));
        cssColors.put("slateblue", new Color("#6a5acd"));
        cssColors.put("slategray", new Color("#708090"));
        cssColors.put("slategrey", new Color("#708090"));
        cssColors.put("snow", new Color("#fffafa"));
        cssColors.put("springgreen", new Color("#00ff7f"));
        cssColors.put("steelblue", new Color("#4682b4"));
        cssColors.put("tan", new Color("#d2b48c"));
        cssColors.put("teal", new Color("#008080"));
        cssColors.put("thistle", new Color("#d8bfd8"));
        cssColors.put("tomato", new Color("#ff6347"));
        cssColors.put("turquoise", new Color("#40e0d0"));
        cssColors.put("violet", new Color("#ee82ee"));
        cssColors.put("wheat", new Color("#f5deb3"));
        cssColors.put("white", new Color("#ffffff"));
        cssColors.put("whitesmoke", new Color("#f5f5f5"));
        cssColors.put("yellow", new Color("#ffff00"));
        cssColors.put("yellowgreen", new Color("#9acd32"));

        cssColors.put("transparent", new Color(0, 0, 0, 0));
        cssColors.put("none", new Color(0, 0, 0, 0));
    }

    private Color(String str) {
        str = str.substring(1);

        this.red = Integer.parseInt(str.substring(0, 2), 16) / 255f;
        this.green = Integer.parseInt(str.substring(2, 4), 16) / 255f;
        this.blue = Integer.parseInt(str.substring(4, 6), 16) / 255f;
        this.alpha = 1;
    }

    public Color(float red, float green, float blue) {
        this(red, green, blue, 1);
    }

    public Color(double red, double green, double blue) {
        this((float) red, (float) green, (float) blue, 1);
    }

    public Color(double red, double green, double blue, double alpha) {
        this((float) red, (float) green, (float) blue, (float) alpha);
    }

    public void setRed(double red) {
        this.red = (float) red;
    }

    public void setGreen(double green) {
        this.green = (float) green;
    }

    public void setBlue(double blue) {
        this.blue = (float) blue;
    }

    public void setAlpha(double alpha) {
        this.alpha = (float) alpha;
    }

    public String toHexString() {
        String r = Integer.toHexString((int) (this.red * 255));
        String g = Integer.toHexString((int) (this.green * 255));
        String b = Integer.toHexString((int) (this.blue * 255));

        if (r.length() == 1) {
            r = '0' + r;
        } else if (r.length() > 2) {
            r = r.substring(0, 2);
        }

        if (g.length() == 1) {
            g = '0' + g;
        } else if (g.length() > 2) {
            g = g.substring(0, 2);
        }

        if (b.length() == 1) {
            b = '0' + b;
        } else if (b.length() > 2) {
            b = b.substring(0, 2);
        }

        return "#" + r + g + b;
    }

    public String toRGBString() {
        return String.format("rgb(%.0f, %.0f, %.0f)", this.red * 255, this.green * 255, this.blue * 255);
    }

    public String toRGBAString() {
        return String.format("rgba(%.0f, %.0f, %.0f, %.2f)", this.red * 255, this.green * 255, this.blue * 255, this.alpha);
    }

    public java.awt.Color toAWTColor() {
        return new java.awt.Color(this.red, this.green, this.blue, this.alpha);
    }

    public static List<String> getCSSColorNames() {
        return new ArrayList<>(cssColors.keySet());
    }

    public static Color parseCSSColor(@NonNull String web) throws ColorException {
        try {
            String color = web.trim().toLowerCase();

            if (color.startsWith("#")) {
                color = color.substring(1);

                if (color.length() == 6) {
                    int r = Integer.parseInt(color.substring(0, 2), 16);
                    int g = Integer.parseInt(color.substring(2, 4), 16);
                    int b = Integer.parseInt(color.substring(4, 6), 16);

                    return new Color(r / 255f, g / 255f, b / 255f);
                } else if (color.length() == 3) {
                    int r = Integer.parseInt(color.substring(0, 1), 16);
                    int g = Integer.parseInt(color.substring(1, 2), 16);
                    int b = Integer.parseInt(color.substring(2, 3), 16);

                    return new Color(r / 15f, g / 15f, b / 15f);
                } else {
                    throw new ColorException("Hex length is neither 3 or 6 long.");
                }
            } else if (color.startsWith("rgba(") && color.endsWith(")")) {
                String[] split = color.substring(5, color.length() - 1).split(",");

                if (split.length == 4) {
                    float r = Float.parseFloat(split[0]);
                    float g = Float.parseFloat(split[1]);
                    float b = Float.parseFloat(split[2]);
                    float a = Float.parseFloat(split[3]);

                    if (((r > 1) || (g > 1) || (b > 1)) && (!split[0].contains(".") && !split[1].contains(".") && !split[2].contains("."))) {
                        r /= 255f;
                        g /= 255f;
                        b /= 255f;
                    }

                    a = Math.min(a, 1);

                    return new Color(r, g, b, a);
                } else {
                    throw new ColorException("Invalid number of arguments in rgba format.");
                }
            } else if (color.startsWith("rgb(") && color.endsWith(")")) {
                String[] split = color.substring(4, color.length() - 1).split(",");

                if (split.length == 3) {
                    float r = Float.parseFloat(split[0]);
                    float g = Float.parseFloat(split[1]);
                    float b = Float.parseFloat(split[2]);

                    if (((r > 1) || (g > 1) || (b > 1)) && !color.contains(".")) {
                        r /= 255f;
                        g /= 255f;
                        b /= 255f;
                    }

                    return new Color(r, g, b);
                } else {
                    throw new ColorException("Invalid number of arguments in rgb format.");
                }
            } else {
                Color css = cssColors.get(color.toLowerCase());

                if (css != null) {
                    return css;
                } else {
                    throw new ColorException("Unsupported format: " + web);
                }
            }
        } catch (NumberFormatException e) {
            throw new ColorException(e.getMessage());
        }
    }

}
