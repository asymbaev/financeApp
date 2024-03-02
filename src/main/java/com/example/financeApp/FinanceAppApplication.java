package com.example.financeApp;

import com.example.financeApp.entity.Amount;
import com.example.financeApp.entity.User;
import com.example.financeApp.repository.AmountRepository;
import com.example.financeApp.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class FinanceAppApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AmountRepository amountRepository;


private static final Logger logger = LoggerFactory.getLogger(FinanceAppApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FinanceAppApplication.class, args);
		logger.info("Finance Application Started");
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Aestro", "12345", "user", "1", 5000);
		User user2 = new User("Pcblt", "8736252", "user2", "2", 5000);
		userRepository.save(user);
		userRepository.save(user2);

		List<Amount> amounts = Arrays.asList(
				new Amount(2L,5000, "A long ago", 5000),
				new Amount(3L, 5000, "a day ago", 5000)

		);
		amountRepository.saveAll(amounts);



		userRepository.save(new User("user", "$2y$10$g.hyfzRf6dyAPCzx7d4wDOYwMVKEvpM/T4q4f48hwnc5Jyh6Ar/vy", "USER", "2", 2000));
		userRepository.save(new User("admin", "$2y$10$oOiL3BSfAZjQPugjnpwMfeF92E8deZERQPvL39EEVDaaelzP9BF5i","ADMIN","3", 3000));

		userRepository.findAll().forEach(us -> logger.info(us.getUserId() + " " + us.getAmount()));
		amountRepository.findAll().forEach(am -> logger.info(am.getHistory() + " " + am.getAmount()));

		if (user.getAmount() == user2.getAmount()) {
			System.out.println("Amounts matched");
		}
	}
}
