package com.example.fatascode.springbootreactfullstack;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


class SpringbootReactFullstackApplicationTests {

    Calculator underTest = new Calculator();
    @Test
    void itShouldAddTwoTNumbers() {
        //given
        int numberOne = 20;
        int numberTwo = 30;

        //when
        int result = underTest.add(numberOne,numberTwo);

        //then
        int expected = 50;
        assertThat(result).isEqualTo(expected);

    }

    class Calculator {
        int add(int a,int b) {return a + b;}
    }

}