package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pizza order test suite")
class PizzaOrderTestSuite {

    private static int counter = 1;

    @BeforeAll
    public static void startTests() {
        System.out.println("Start testing...." + "\n");
    }

    @AfterAll
    public static void endTests() {
        System.out.println("All test done");
    }

    @BeforeEach
    public void testCounter() {
        System.out.println("Test nr " + counter++);
    }

    @AfterEach
    public void endTest() {
        System.out.println("Test done");
    }

    @Nested
    class BasicPizza {
        @Test
        @DisplayName("Test pizza order get cost")
        public void testBasicPizzaOrderGetCost() {
            //Given
            PizzaOrder pizzaOrder = new BasicPizzaOrder();
            System.out.println("Basic pizza cost: " + pizzaOrder.getCost() + " zl");
            //When
            BigDecimal cost = pizzaOrder.getCost();

            //Then
            assertEquals(new BigDecimal(15), cost);
        }

        @Test
        @DisplayName("Test pizza order get description")
        public void testBasicPizzaOrderGetDescription() {
            //Given
            PizzaOrder pizzaOrder = new BasicPizzaOrder();
            System.out.println(pizzaOrder.getDescription());
            //When
            String description = pizzaOrder.getDescription();

            //Then
            assertEquals("Pizza crust + tomato sauce + cheese", description);
        }
    }

    @Nested
    @DisplayName("All ingredients")
    class AllIngredients {
        @Test
        @DisplayName("Test pizza order get cost")
        public void testPizzaOrderWithAdditionalIngredientsGetCost() {
            //Given
            PizzaOrder pizzaOrder = new BasicPizzaOrder();
            pizzaOrder = new HamDecorator(pizzaOrder);
            pizzaOrder = new MushroomsDecorator(pizzaOrder);
            pizzaOrder = new PepperDecorator(pizzaOrder);
            pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
            pizzaOrder = new BasilDecorator(pizzaOrder);
            System.out.println("Pizza cost: " + pizzaOrder.getCost() + " zl");

            //When
            BigDecimal cost = pizzaOrder.getCost();

            //Then
            assertEquals(new BigDecimal(39), cost);
        }

        @Test
        @DisplayName("Test pizza order get description")
        public void testPizzaOrderWithAdditionalIngredientsGetDescription() {
            //Given
            PizzaOrder pizzaOrder = new BasicPizzaOrder();
            pizzaOrder = new HamDecorator(pizzaOrder);
            pizzaOrder = new MushroomsDecorator(pizzaOrder);
            pizzaOrder = new PepperDecorator(pizzaOrder);
            pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
            pizzaOrder = new BasilDecorator(pizzaOrder);
            System.out.println(pizzaOrder.getDescription());

            //When
            String description = pizzaOrder.getDescription();

            //Then
            assertEquals("Pizza crust + tomato sauce + cheese + ham + mushrooms + pepper + extra cheese + basil", description);
        }
    }

    @Nested
    @DisplayName("Random ingredients")
    class RandomIngredients {
        @Test
        @DisplayName("Test pizza order get cost")
        public void testPizzaOrderWithAdditionalIngredientsGetCost() {
            //Given
            PizzaOrder pizzaOrder = new BasicPizzaOrder();
            pizzaOrder = new HamDecorator(pizzaOrder);
            pizzaOrder = new MushroomsDecorator(pizzaOrder);
            pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
            System.out.println("Pizza cost: " + pizzaOrder.getCost() + " zl");

            //When
            BigDecimal cost = pizzaOrder.getCost();

            //Then
            assertEquals(new BigDecimal(27), cost);
        }

        @Test
        @DisplayName("Test pizza order get description")
        public void testPizzaOrderWithAdditionalIngredientsGetDescription() {
            //Given
            PizzaOrder pizzaOrder = new BasicPizzaOrder();
            pizzaOrder = new HamDecorator(pizzaOrder);
            pizzaOrder = new MushroomsDecorator(pizzaOrder);
            pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
            System.out.println(pizzaOrder.getDescription());

            //When
            String description = pizzaOrder.getDescription();

            //Then
            assertEquals("Pizza crust + tomato sauce + cheese + ham + mushrooms + extra cheese", description);
        }
    }

}