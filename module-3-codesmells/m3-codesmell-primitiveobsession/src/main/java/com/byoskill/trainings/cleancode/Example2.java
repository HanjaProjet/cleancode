/*
 * Copyright (C) 2017 Sylvain Leroy - BYOSkill Company All Rights Reserved
 * You may use, distribute and modify this code under the
 * terms of the MIT license, which unfortunately won't be
 * written for another century.
 *
 * You should have received a copy of the MIT license with
 * this file. If not, please write to: sleroy at byoskill.com, or visit : www.byoskill.com
 *
 */
package com.byoskill.trainings.cleancode;

import java.util.stream.Stream;

public class Example2 {

    public static void main(final String args[]) {

		Stream.of("london:13000000", "New York:21903623", "Tokyo:12570000", "Stockholm:1932763","Barcelona:1605602", "Sydney:4119190")
			  .map(cityInfo -> cityInfo.split(":"))
			  .map(cityArray -> new CityBuilder().withName(cityArray[0]).withPopulation(Integer.valueOf(cityArray[1])).createCity())
			  .map(city -> city.getPopulation())
			  .forEach(System.out::println);

    }

}
