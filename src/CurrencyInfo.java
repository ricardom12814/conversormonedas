public class CurrencyInfo {
    private String code;
    private String name;
    private int numericCode;
    private String country;

    public CurrencyInfo(String code, String name, int numericCode, String country) {
        this.code = code;
        this.name = name;
        this.numericCode = numericCode;
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getNumericCode() {
        return numericCode;
    }

    public String getCountry() {
        return country;
    }

    public static CurrencyInfo[] CurrencyArray() {
        CurrencyInfo[] currencies = new CurrencyInfo[]{
                new CurrencyInfo("AED", "Dírham de los Emiratos Árabes Unidos", 784, "Emiratos Arabes Unidos"),
                new CurrencyInfo("AFN", "Afgani afgano", 971, "Afganistan"),
                new CurrencyInfo("ALL", "Lek albanés", 8, "Albania"),
                new CurrencyInfo("AMD", "Dram armenio", 51, "Armenia"),
                new CurrencyInfo("ANG", "Florín antillano neerlandés", 532, "Antillas Neerlandesas"),
                new CurrencyInfo("AOA", "Kwanza angoleño", 973, "Angola"),
                new CurrencyInfo("ARS", "Peso argentino", 32, "Argentina"),
                new CurrencyInfo("AUD", "Dólar australiano", 36, "Australia"),
                new CurrencyInfo("AWG", "Florín arubeño", 533, "Aruba"),
                new CurrencyInfo("AZN", "Manat azerí", 944, "Azerbaiyan"),
                new CurrencyInfo("BAM", "Marco convertible de Bosnia-Herzegovina", 977, "Bosnia-Herzegovina"),
                new CurrencyInfo("BBD", "Dólar de Barbados", 52, "Barbados"),
                new CurrencyInfo("BDT", "Taka bangladesí", 50, "Bangladesh"),
                new CurrencyInfo("BGN", "Lev búlgaro", 975, "Bulgaria"),
                new CurrencyInfo("BHD", "Dinar bahreiní", 48, "Bahrein"),
                new CurrencyInfo("BIF", "Franco burundés", 108, "Burundi"),
                new CurrencyInfo("BMD", "Dólar bermudeño", 60, "Bermudas"),
                new CurrencyInfo("BND", "Dólar de Brunéi", 96, "Brunei"),
                new CurrencyInfo("BOB", "Boliviano", 68, "Bolivia"),
                new CurrencyInfo("BRL", "Real brasileño", 986, "Brasil"),
                new CurrencyInfo("BSD", "Dólar bahameño", 44, "Bahamas"),
                new CurrencyInfo("BTN", "Ngultrum butanés", 64, "Butan"),
                new CurrencyInfo("BWP", "Pula botsuano", 72, "Botsuana"),
                new CurrencyInfo("BYN", "Rublo bielorruso", 933, "Bielorrusia"),
                new CurrencyInfo("BZD", "Dólar beliceño", 84, "Belice"),
                new CurrencyInfo("CAD", "Dólar canadiense", 124, "Canada"),
                new CurrencyInfo("CDF", "Franco congoleño", 976, "Republica Democratica del Congo"),
                new CurrencyInfo("CHF", "Franco suizo", 756, "Suiza"),
                new CurrencyInfo("CLP", "Peso chileno", 152, "Chile"),
                new CurrencyInfo("CNY", "Yuan chino", 156, "China"),
                new CurrencyInfo("COP", "Peso colombiano", 170, "Colombia"),
                new CurrencyInfo("CRC", "Colón costarricense", 188, "Costa Rica"),
                new CurrencyInfo("CUP", "Peso cubano", 192, "Cuba"),
                new CurrencyInfo("CVE", "Escudo caboverdiano", 132, "Cabo Verde"),
                new CurrencyInfo("CZK", "Corona checa", 203, "Chequia"),
                new CurrencyInfo("DJF", "Franco yibutiano", 262, "Yibuti"),
                new CurrencyInfo("DKK", "Corona danesa", 208, "Dinamarca"),
                new CurrencyInfo("DOP", "Peso dominicano", 214, "Republica Dominicana"),
                new CurrencyInfo("DZD", "Dinar argelino", 12, "Argelia"),
                new CurrencyInfo("EGP", "Libra egipcia", 818, "Egipto"),
                new CurrencyInfo("ERN", "Nakfa eritreo", 232, "Eritrea"),
                new CurrencyInfo("ETB", "Birr etíope", 230, "Etiopia"),
                new CurrencyInfo("EUR", "Euro", 978, "Zona Euro"),
                new CurrencyInfo("FJD", "Dólar fiyiano", 242, "Fiyi"),
                new CurrencyInfo("FKP", "Libra malvinense", 238, "Islas Malvinas"),
                new CurrencyInfo("FOK", "Corona feroesa", 238, "Islas Feroe"),
                new CurrencyInfo("GBP", "Libra esterlina", 826, "Reino Unido"),
                new CurrencyInfo("GEL", "Lari georgiano", 981, "Georgia"),
                new CurrencyInfo("GGP", "Libra de Guernsey", 831, "Guernsey"),
                new CurrencyInfo("GHS", "Cedi ghanés", 936, "Ghana"),
                new CurrencyInfo("GIP", "Libra de Gibraltar", 292, "Gibraltar"),
                new CurrencyInfo("GMD", "Dalasi gambiano", 270, "Gambia"),
                new CurrencyInfo("GNF", "Franco guineano", 324, "Guinea"),
                new CurrencyInfo("GTQ", "Quetzal guatemalteco", 320, "Guatemala"),
                new CurrencyInfo("GYD", "Dólar guyanés", 328, "Guyana"),
                new CurrencyInfo("HKD", "Dólar de Hong Kong", 344, "Hong Kong"),
                new CurrencyInfo("HNL", "Lempira hondureño", 340, "Honduras"),
                new CurrencyInfo("HRK", "Kuna croata", 191, "Croacia"),
                new CurrencyInfo("HTG", "Gourde haitiano", 332, "Haiti"),
                new CurrencyInfo("HUF", "Florín húngaro", 348, "Hungria"),
                new CurrencyInfo("IDR", "Rupia indonesia", 360, "Indonesia"),
                new CurrencyInfo("ILS", "Nuevo séquel israelí", 376, "Israel"),
                new CurrencyInfo("IMP", "Libra de la Isla de Man", 833, "Isla de Man"),
                new CurrencyInfo("INR", "Rupia india", 356, "India"),
                new CurrencyInfo("IQD", "Dinar iraquí", 368, "Irak"),
                new CurrencyInfo("IRR", "Rial iraní", 364, "Iran"),
                new CurrencyInfo("ISK", "Corona islandesa", 352, "Islandia"),
                new CurrencyInfo("JEP", "Libra de Jersey", 832, "Jersey"),
                new CurrencyInfo("JMD", "Dólar jamaiquino", 388, "Jamaica"),
                new CurrencyInfo("JOD", "Dinar jordano", 400, "Jordania"),
                new CurrencyInfo("JPY", "Yen japonés", 392, "Japon"),
                new CurrencyInfo("KES", "Chelín keniano", 404, "Kenia"),
                new CurrencyInfo("KGS", "Som kirguís", 417, "Kirguistan"),
                new CurrencyInfo("KHR", "Riel camboyano", 116, "Camboya"),
                new CurrencyInfo("KID", "Dólar kiribatiano", 296, "Kiribati"),
                new CurrencyInfo("KMF", "Franco comorense", 174, "Comoras"),
                new CurrencyInfo("KRW", "Won surcoreano", 410, "Corea del Sur"),
                new CurrencyInfo("KWD", "Dinar kuwaití", 414, "Kuwait"),
                new CurrencyInfo("KYD", "Dólar de las Islas Caimán", 136, "Islas Caiman"),
                new CurrencyInfo("KZT", "Tenge kazajo", 398, "Kazajistan"),
                new CurrencyInfo("LAK", "Kip laosiano", 418, "Laos"),
                new CurrencyInfo("LBP", "Libra libanesa", 422, "Libano"),
                new CurrencyInfo("LKR", "Rupia de Sri Lanka", 144, "Sri Lanka"),
                new CurrencyInfo("LRD", "Dólar liberiano", 430, "Liberia"),
                new CurrencyInfo("LSL", "Loti lesothense", 426, "Lesoto"),
                new CurrencyInfo("LYD", "Dinar libio", 434, "Libia"),
                new CurrencyInfo("MAD", "Dírham marroquí", 504, "Marruecos"),
                new CurrencyInfo("MDL", "Leu moldavo", 498, "Moldavia"),
                new CurrencyInfo("MGA", "Ariary malgache", 969, "Madagascar"),
                new CurrencyInfo("MKD", "Denar macedonio", 807, "Macedonia del Norte"),
                new CurrencyInfo("MMK", "Kyat birmano", 104, "Birmania"),
                new CurrencyInfo("MNT", "Tugrik mongol", 496, "Mongolia"),
                new CurrencyInfo("MOP", "Pataca macaense", 446, "Macao"),
                new CurrencyInfo("MRU", "Ouguiya mauritano", 929, "Mauritania"),
                new CurrencyInfo("MUR", "Rupia mauriciana", 480, "Mauricio"),
                new CurrencyInfo("MVR", "Rufiyaa maldiva", 462, "Maldivas"),
                new CurrencyInfo("MWK", "Kwacha malauí", 454, "Malaui"),
                new CurrencyInfo("MXN", "Peso mexicano", 484, "Mexico"),
                new CurrencyInfo("MYR", "Ringgit malayo", 458, "Malasia"),
                new CurrencyInfo("MZN", "Metical mozambiqueño", 943, "Mozambique"),
                new CurrencyInfo("NAD", "Dólar namibio", 516, "Namibia"),
                new CurrencyInfo("NGN", "Naira nigeriana", 566, "Nigeria"),
                new CurrencyInfo("NIO", "Córdoba nicaragüense", 558, "Nicaragua"),
                new CurrencyInfo("NOK", "Corona noruega", 578, "Noruega"),
                new CurrencyInfo("NPR", "Rupia nepalí", 524, "Nepal"),
                new CurrencyInfo("NZD", "Dólar neozelandés", 554, "Nueva Zelanda"),
                new CurrencyInfo("OMR", "Rial omaní", 512, "Oman"),
                new CurrencyInfo("PAB", "Balboa panameño", 590, "Panama"),
                new CurrencyInfo("PEN", "Sol peruano", 604, "Peru"),
                new CurrencyInfo("PGK", "Kina de Papúa Nueva Guinea", 598, "Papua Nueva Guinea"),
                new CurrencyInfo("PHP", "Peso filipino", 608, "Filipinas"),
                new CurrencyInfo("PKR", "Rupia pakistaní", 586, "Pakistan"),
                new CurrencyInfo("PLN", "Złoty polaco", 985, "Polonia"),
                new CurrencyInfo("PYG", "Guaraní paraguayo", 600, "Paraguay"),
                new CurrencyInfo("QAR", "Riyal catarí", 634, "Catar"),
                new CurrencyInfo("RON", "Leu rumano", 946, "Rumania"),
                new CurrencyInfo("RSD", "Dinar serbio", 941, "Serbia"),
                new CurrencyInfo("RUB", "Rublo ruso", 643, "Rusia"),
                new CurrencyInfo("RWF", "Franco ruandés", 646, "Ruanda"),
                new CurrencyInfo("SAR", "Riyal saudí", 682, "Arabia Saudita"),
                new CurrencyInfo("SBD", "Dólar de las Islas Salomón", 90, "Islas Salomon"),
                new CurrencyInfo("SCR", "Rupia de Seychelles", 690, "Seychelles"),
                new CurrencyInfo("SDG", "Libra sudanesa", 938, "Sudan"),
                new CurrencyInfo("SEK", "Corona sueca", 752, "Suecia"),
                new CurrencyInfo("SGD", "Dólar singapurense", 702, "Singapur"),
                new CurrencyInfo("SHP", "Libra de Santa Elena", 654, "Santa Elena"),
                new CurrencyInfo("SLL", "Leone sierraleonés", 694, "Sierra Leona"),
                new CurrencyInfo("SOS", "Chelín somalí", 706, "Somalia"),
                new CurrencyInfo("SRD", "Dólar surinamés", 968, "Surinam"),
                new CurrencyInfo("SSP", "Libra sursudanesa", 728, "Sudan del Sur"),
                new CurrencyInfo("STN", "Dobra santotomense", 930, "Santo Tome y Principe"),
                new CurrencyInfo("SYP", "Libra siria", 760, "Siria"),
                new CurrencyInfo("SZL", "Lilangeni suazi", 748, "Suazilandia"),
                new CurrencyInfo("THB", "Baht tailandés", 764, "Tailandia"),
                new CurrencyInfo("TJS", "Somoni tayiko", 972, "Tayikistan"),
                new CurrencyInfo("TMT", "Manat turcomano", 934, "Turkmenistan"),
                new CurrencyInfo("TND", "Dinar tunecino", 788, "Tunez"),
                new CurrencyInfo("TOP", "Paʻanga tongano", 776, "Tonga"),
                new CurrencyInfo("TRY", "Lira turca", 949, "Turquia"),
                new CurrencyInfo("TTD", "Dólar de Trinidad y Tobago", 780, "Trinidad y Tobago"),
                new CurrencyInfo("TVD", "Dólar tuvaluano", 983, "Tuvalu"),
                new CurrencyInfo("TWD", "Nuevo dólar taiwanés", 901, "Taiwan"),
                new CurrencyInfo("TZS", "Chelín tanzano", 834, "Tanzania"),
                new CurrencyInfo("UAH", "Grivna ucraniana", 980, "Ucrania"),
                new CurrencyInfo("UGX", "Chelín ugandés", 800, "Uganda"),
                new CurrencyInfo("USD", "Dólar estadounidense", 840, "Estados Unidos"),
                new CurrencyInfo("UYU", "Peso uruguayo", 858, "Uruguay"),
                new CurrencyInfo("UZS", "Som uzbeko", 860, "Uzbekistan"),
                new CurrencyInfo("VES", "Bolívar venezolano", 928, "Venezuela"),
                new CurrencyInfo("VND", "Dong vietnamita", 704, "Vietnam"),
                new CurrencyInfo("VUV", "Vatu vanuatuense", 548, "Vanuatu"),
                new CurrencyInfo("WST", "Tala samoano", 882, "Samoa"),
                new CurrencyInfo("XAF", "Franco CFA de África Central", 950, "CEMAC"),
                new CurrencyInfo("XCD", "Dólar del Caribe Oriental", 951, "Organizacion de Estados del Caribe Oriental"),
                new CurrencyInfo("XOF", "Franco CFA de África Occidental", 952, "UEMOA"),
                new CurrencyInfo("XPF", "Franco CFP", 953, "Polinesia Francesa"),
                new CurrencyInfo("YER", "Rial yemení", 886, "Yemen"),
                new CurrencyInfo("ZAR", "Rand sudafricano", 710, "Sudafrica"),
                new CurrencyInfo("ZMW", "Kwacha zambiano", 967, "Zambia"),
                new CurrencyInfo("ZWL", "Dólar zimbabuense", 932, "Zimbabue")
        };

        return currencies;
    }
}


