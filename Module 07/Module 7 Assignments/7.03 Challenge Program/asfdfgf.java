        
        for (int i =0; i > years.length; i++) {
            if (years[i] >= yearMinRange && years[i] <= yearMaxRange) {
                yearsV2[i] = years[i];
                monthsV2[i] = months[i];
                pressuresV2[i] = pressures[i];
                windSpeedsV2[i] = windSpeeds[i];
                namesV2[i] = names[i];

            } else {
                continue;
            }

        }        
        for (int i =0; i < years.length; i++) {
    System.out.println(years[i]);
}
        yearsV2 = Arrays.stream(yearsV2).filter(d -> d != 0.0).toArray();