package com.accounting.personal.ontrack.repository;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OntrackRepositoryApplicationTests {

    @Test
    public void createEncryptedProperty() {
        String password = "abracadabra";
        System.setProperty("jasypt.encryptor.password", password);

        String text = "password";

        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(password);

        String myEncryptedText = textEncryptor.encrypt(text);
        System.out.println("myEncryptedText: " + myEncryptedText);

        String plainText = textEncryptor.decrypt(myEncryptedText);
        System.out.println("plainText: " + plainText);
    }

}
