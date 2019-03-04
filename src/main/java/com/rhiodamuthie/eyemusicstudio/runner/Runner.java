//package com.rhiodamuthie.eyemusicstudio.runner;
//
//import com.rhiodamuthie.eyemusicstudio.model.Customer;
//import com.rhiodamuthie.eyemusicstudio.repository.CustomerRepository;
//import com.rhiodamuthie.eyemusicstudio.service.SoccerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.sql.DataSource;
//import java.text.SimpleDateFormat;
//import java.util.List;
//import java.util.stream.Stream;
//
//import static java.lang.System.exit;
//
//@Component
//public class Runner implements CommandLineRunner {
//
//    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//    @Autowired
//    DataSource dataSource;
//
//    @Autowired
//    CustomerRepository customerRepository;
//
//    @Autowired
//    SoccerService soccerService;
//
//    public void test(){
//        System.out.println("test");
//    }
//
//    public void start(){
//        try {
//            run();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Transactional(readOnly = true)
//    @Override
//    public void run(String... args) throws Exception {
//
//
//
//
//        System.out.println("DATASOURCE = " + dataSource);
//
//        soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);
//        List<String> players = soccerService.getAllTeamPlayers(1);
//        for(String player : players)
//        {
//            System.out.println("Introducing Barca player => " + player);
//        }
//
//        System.out.println("\n1.findAll()...");
//        for (Customer customer : customerRepository.findAll()) {
//            System.out.println(customer);
//        }
//
//        System.out.println("\n2.findByEmail(String email)...");
//        for (Customer customer : customerRepository.findByEmail("222@yahoo.com")) {
//            System.out.println(customer);
//        }
//
//        System.out.println("\n3.findByDate(Date date)...");
//        for (Customer customer : customerRepository.findByDate(sdf.parse("2017-02-12"))) {
//            System.out.println(customer);
//        }
//
//        // For Stream, need @Transactional
//        System.out.println("\n4.findByEmailReturnStream(@Param(\"email\") String email)...");
//        try (Stream<Customer> stream = customerRepository.findByEmailReturnStream("333@yahoo.com")) {
//            stream.forEach(x -> System.out.println(x));
//        }
//
//        System.out.println("Done!");
//
//        exit(0);
//    }
//}
