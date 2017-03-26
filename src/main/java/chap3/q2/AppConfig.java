package chap3.q2;

import org.springframework.context.annotation.Bean;

class AppConfig {

   @Bean(name = "greet1")
   public greet getGreet1() {

       return new Morning();

   }

   @Bean(name = "greet2")
   public greet getGreet2() {

       return new Afternoon();

   }

    @Bean(name = "greet3")
    public greet getGreet3() {

        return new Evening();

    }

}
