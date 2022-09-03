package com.ud.password.model;

import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class Password {
    public String generate(int length,int type){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        String upperCaseChar = "ABCDEFGHIJKLMNOPQRSUVWXYZ";
        String lowerCaseChar = upperCaseChar.toLowerCase();
        String numbers = "0123456789";
        String specialChar = "~`!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
        String masterString = null;
        switch (type){
            case 1->masterString=upperCaseChar;
            case 2->masterString=upperCaseChar+lowerCaseChar;
            case 3->masterString=upperCaseChar+lowerCaseChar+numbers;
            case 4->masterString=upperCaseChar+lowerCaseChar+numbers+specialChar;
        }

        for (int i=1;i<=length;i++){
            stringBuilder.append(masterString.charAt(random.nextInt(masterString.length())));
        }

        return stringBuilder.toString();
    }
}
