package com.bookmyshow.demo.services;

import com.bookmyshow.demo.dtos.BookShowRequestDto;
import com.bookmyshow.demo.exceptions.UserIsNotValid;
import com.bookmyshow.demo.models.Booking;
import com.bookmyshow.demo.models.User;
import com.bookmyshow.demo.repositories.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Getter
@Setter
@Service
public class BookingService {

    private UserRepository userRepository;
    public Booking bookShow(BookShowRequestDto request) throws UserIsNotValid {

        //get user with userId
        Optional<User> user = userRepository.findById(request.getUserId());
        if(!user.isPresent()){
            throw new UserIsNotValid();
        }
        return new Booking();
    }
}
