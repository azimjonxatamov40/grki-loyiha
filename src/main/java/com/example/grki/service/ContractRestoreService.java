package com.example.grki.service;

import com.example.grki.model.CreditorInfo;
import com.example.grki.model.contractRestore.ContractInfo;
import com.example.grki.model.contractRestore.ContractRestoreRequest;
import org.springframework.stereotype.Service;


@Service
public class ContractRestoreService {

    public ContractRestoreRequest saveContractRestore(String saveMode,
                                                      String type,
                                                      String code,
                                                      String office,
                                                      String contractGuid,
                                                      String contractId) {
        return ContractRestoreRequest.builder()
                .saveMode(saveMode)
                .creditor(CreditorInfo.builder()
                        .type(type)
                        .code(code)
                        .office(office)
                        .build())
                .contract(ContractInfo.builder()
                        .contractGuid(contractGuid)
                        .contractId(contractId)
                        .build())
                .build();
    }
}
