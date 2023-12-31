package com.example.controller;

import com.example.service.BorrowService;
import com.example.vo.BorrowVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BorrowController {

    private final BorrowService borrowService;

    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService;
    }

    @GetMapping("/borrow/{userId}")
    public BorrowVO getUserBorrowDetailByUserId(@PathVariable("userId") int userId) {
        return borrowService.getUserBorrowDetailByUserId(userId);
    }
}
