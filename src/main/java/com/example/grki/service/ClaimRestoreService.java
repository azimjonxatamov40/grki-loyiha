package com.example.grki.service;

import com.example.grki.model.CreditorInfo;
import com.example.grki.model.claimRestore.ClaimInfo;
import com.example.grki.model.claimRestore.ClaimRestoreRequest;
import org.springframework.stereotype.Service;


@Service
public class ClaimRestoreService {

    public ClaimRestoreRequest restoreClaim(String saveMode,
                                            String type,
                                            String code,
                                            String office,
                                            String claimGuid,
                                            String claimId) {
        return ClaimRestoreRequest.builder()
                .saveMode(saveMode)
                .creditor(CreditorInfo.builder()
                        .type(type)
                        .code(code)
                        .office(office)
                        .build())
                .claim(ClaimInfo.builder()
                        .claimGuid(claimGuid)
                        .claimId(claimId)
                        .build())
                .build();
    }
}
