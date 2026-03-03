package com.trading.strategy_service.grpc;

import com.trading.contracts.v1.GetStrategyRequest;
import com.trading.contracts.v1.GetStrategyResponse;
import com.trading.contracts.v1.StrategyServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class StrategyGrpcService extends StrategyServiceGrpc.StrategyServiceImplBase {

    @Override
    public void getStrategy(GetStrategyRequest request, StreamObserver<GetStrategyResponse> responseObserver) {
        GetStrategyResponse response = GetStrategyResponse.newBuilder()
                .setStrategyId(request.getStrategyId())
                .setUserId("stub-user")
                .setName("stub-name")
                .setType("SMA")
                .setStatus("DRAFT")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
