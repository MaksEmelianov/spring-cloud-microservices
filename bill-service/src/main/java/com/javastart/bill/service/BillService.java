package com.javastart.bill.service;

import com.javastart.bill.entity.Bill;
import com.javastart.bill.exception.BillNotFoundException;
import com.javastart.bill.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

@Service
public class BillService {

    private final BillRepository billRepository;

    @Autowired
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public Long createBill(Long accountId, BigDecimal amount, Boolean isDefault, Boolean overdraftEnable) {
        return billRepository.save(new Bill(accountId, amount, isDefault, overdraftEnable, OffsetDateTime.now()))
                .getAccountId();
    }

    public Bill getBillById(Long billId) {
        return billRepository.findById(billId)
                .orElseThrow(() -> new BillNotFoundException("Unable to find bill with id:" + billId));
    }

    public Bill updateBill(Long billId, Long accountId,
                           BigDecimal amount, Boolean isDefault, Boolean overdraftEnabled) {
        Bill bill = new Bill();
        bill.setBillId(billId);
        bill.setAccountId(accountId);
        bill.setAmount(amount);
        bill.setIsDefault(isDefault);
        bill.setOverdraftEnabled(overdraftEnabled);
        return billRepository.save(bill);
    }

    public Bill deleteBill(Long billId) {
        Bill billDelete = getBillById(billId);
        billRepository.deleteById(billId);
        return billDelete;
    }

    public List<Bill> getBillsByAccountId(Long accountId) {
        return billRepository.findBillByAccountId(accountId);
    }
}
