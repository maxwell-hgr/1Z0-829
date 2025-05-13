import java.time.*;


public class DateAndTime{
	public static void main(String... args){
		System.out.println(LocalDate.now()); // 2025-03-13
		System.out.println(LocalTime.now()); // 08:48:35.858985113
		System.out.println(LocalDateTime.now()); // 2025-03-13T08:48:35.859034853
		System.out.println(ZonedDateTime.now()); // 2025-03-13T08:48:35.859414203-03:00[America/Sao_Paulo]

		var date1 = LocalDate.of(2020, Month.FEBRUARY, 20); // criando com enum de meses
		var date2 = LocalDate.of(2020, 2, 20); // criando com int para o mês

		System.out.println(date1);
		System.out.println(date2);

		var time1 = LocalTime.of(12, 5); // doze horas e cinco minutos
		var time2 = LocalTime.of(12, 5, 30); // doze horas, cinco minutos e trinta segundos
		var time3 = LocalTime.of(12, 5, 30, 25000213); // doze horas, cinco minutos, trinta segundos e 025000213 nanos

		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);

		var dateTime1 = LocalDateTime.of(2020, Month.FEBRUARY, 20, 12, 5, 30, 25000213); // juntando date e time
		var dateTime2 = LocalDateTime.of(date1, time1); // usando referencias existentes de date e time

		System.out.println(dateTime1);
		System.out.println(dateTime2);

		var zone1 = ZoneId.of("US/Eastern"); // definindo o zone
		var zonedDateTime1 = ZonedDateTime.of(date1, time1, zone1); // criando date time com zone

		System.out.println(zonedDateTime1);

		// var notCompile = new LocalDate();


		var date3 = date1.plusDays(2); // adicionando 2 dias ao date
		date3 = date3.plusWeeks(2); // adicionando 2 semanas ao date
		date3.plusYears(2); // não faz nada, já que o valor não foi assinado a uma referência

		System.out.println(date3);

		// voltando para o date1
		date3 = date3.minusDays(2);
		date3 = date3.minusWeeks(2);

		System.out.println(date3);

		// period
		var anualmente = Period.ofYears(1); // P1Y
		var trimestralmente = Period.ofMonths(3); // P3M
		var aCada3Semanas = Period.ofWeeks(3); // P21D
		var diaSimDiaNao = Period.ofDays(2); // P2D
		var aCadaAnoEUmaSemana = Period.of(1,0,7); // a cada ano e uma semana, exatamente - P1Y7D

		System.out.println(anualmente + " " + trimestralmente + " " + aCada3Semanas + " " + diaSimDiaNao + " " + aCadaAnoEUmaSemana);

		// duration
		var diariamente = Duration.ofDays(1); // PT24H
		var aCadaHora = Duration.ofHours(1); // PT1H
		var aCadaMinuto = Duration.ofMinutes(1); // PT1M
		var aCadaNano = Duration.ofNanos(1); // PT0.000000001S

		System.out.println(diariamente + " " + aCadaHora + " " + aCadaMinuto + " " + aCadaNano);

		// instant
		var agora = Instant.now();
		var depois = Instant.now();

		System.out.println(agora);		
		System.out.println(depois);

		System.out.println(Duration.between(agora, depois));

		var zonedDateTimeToInstant = zonedDateTime1.toInstant();
		System.out.println(zonedDateTimeToInstant);

	}
}