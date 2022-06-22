package javaTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TesteExercicio {
    public static void main(String[] args) {
       /*LocalDateTime hoje = LocalDateTime.now();
        System.out.println("LocalDate: " + hoje); */

        ZonedDateTime hojeZone = ZonedDateTime.now();
        System.out.println("ZonedDateTime: " + hojeZone);

       OffsetDateTime hojeOffset = OffsetDateTime.parse("2022-03-13T19:01:45.768149722-03:00");
        System.out.println("Offset: " + hojeOffset);

       Instant hojeInstant = Instant.now();
        System.out.println("Instant: " + hojeInstant);

        ZoneOffset zoneOffset= ZoneOffset.of("+03:00");
        OffsetDateTime novoOffset = OffsetDateTime.parse("2022-03-13T18:01:45.768149722+03:00");
        System.out.println("Offset: " + novoOffset);

        Long hora = hojeOffset.until(novoOffset, ChronoUnit.HOURS);
        System.out.println(hora);

        ZonedDateTime novaData = ZonedDateTime.parse("2022-03-12T20:17:43.936594508Z[Europe/London]");
        System.out.println(novaData);

        LocalDateTime novaData2 = LocalDateTime.parse("2022-03-12T20:17:43.936594508");
        System.out.println(novaData2);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEE, dd/L/Y - HH:mm:ss VV");
        String dataFormatada =hojeZone.format(formato);
        System.out.println(dataFormatada);

        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("cccc, D/M/yyy - HH:mm:ss zz");
        String dataFormatada2 =hojeZone.format(formato2);
        System.out.println(dataFormatada2);

        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("e, d/L/Y - hh:mm:ss v");
        String dataFormatada3 =hojeZone.format(formato3);
        System.out.println(dataFormatada3);





    }
}
