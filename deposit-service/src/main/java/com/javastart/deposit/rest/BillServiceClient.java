package com.javastart.deposit.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "bill-service")
public interface BillServiceClient {

    @RequestMapping(name = "bills/{billId}", method = RequestMethod.GET)
    BillResponseDTO getBillById(Long billId);

    @RequestMapping(name = "bills/account/{billID}", method = RequestMethod.GET)
    List<BillResponseDTO> getBillsByAccountId(Long accountId);

    @RequestMapping(name = "bills/{billId}", method = RequestMethod.PUT)
    void update(@PathVariable("billId") Long billId, BillRequestDTO billRequestDTO);
}
