package com.trading.contracts.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * -------- Backtesting --------
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class BacktestingServiceGrpc {

  private BacktestingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "trading.v1.BacktestingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.trading.contracts.v1.StartBacktestRequest,
      com.trading.contracts.v1.StartBacktestResponse> getStartBacktestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartBacktest",
      requestType = com.trading.contracts.v1.StartBacktestRequest.class,
      responseType = com.trading.contracts.v1.StartBacktestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trading.contracts.v1.StartBacktestRequest,
      com.trading.contracts.v1.StartBacktestResponse> getStartBacktestMethod() {
    io.grpc.MethodDescriptor<com.trading.contracts.v1.StartBacktestRequest, com.trading.contracts.v1.StartBacktestResponse> getStartBacktestMethod;
    if ((getStartBacktestMethod = BacktestingServiceGrpc.getStartBacktestMethod) == null) {
      synchronized (BacktestingServiceGrpc.class) {
        if ((getStartBacktestMethod = BacktestingServiceGrpc.getStartBacktestMethod) == null) {
          BacktestingServiceGrpc.getStartBacktestMethod = getStartBacktestMethod =
              io.grpc.MethodDescriptor.<com.trading.contracts.v1.StartBacktestRequest, com.trading.contracts.v1.StartBacktestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartBacktest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.StartBacktestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.StartBacktestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BacktestingServiceMethodDescriptorSupplier("StartBacktest"))
              .build();
        }
      }
    }
    return getStartBacktestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trading.contracts.v1.GetBacktestRequest,
      com.trading.contracts.v1.GetBacktestResponse> getGetBacktestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBacktest",
      requestType = com.trading.contracts.v1.GetBacktestRequest.class,
      responseType = com.trading.contracts.v1.GetBacktestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trading.contracts.v1.GetBacktestRequest,
      com.trading.contracts.v1.GetBacktestResponse> getGetBacktestMethod() {
    io.grpc.MethodDescriptor<com.trading.contracts.v1.GetBacktestRequest, com.trading.contracts.v1.GetBacktestResponse> getGetBacktestMethod;
    if ((getGetBacktestMethod = BacktestingServiceGrpc.getGetBacktestMethod) == null) {
      synchronized (BacktestingServiceGrpc.class) {
        if ((getGetBacktestMethod = BacktestingServiceGrpc.getGetBacktestMethod) == null) {
          BacktestingServiceGrpc.getGetBacktestMethod = getGetBacktestMethod =
              io.grpc.MethodDescriptor.<com.trading.contracts.v1.GetBacktestRequest, com.trading.contracts.v1.GetBacktestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBacktest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.GetBacktestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.GetBacktestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BacktestingServiceMethodDescriptorSupplier("GetBacktest"))
              .build();
        }
      }
    }
    return getGetBacktestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BacktestingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BacktestingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BacktestingServiceStub>() {
        @java.lang.Override
        public BacktestingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BacktestingServiceStub(channel, callOptions);
        }
      };
    return BacktestingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static BacktestingServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BacktestingServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BacktestingServiceBlockingV2Stub>() {
        @java.lang.Override
        public BacktestingServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BacktestingServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return BacktestingServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BacktestingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BacktestingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BacktestingServiceBlockingStub>() {
        @java.lang.Override
        public BacktestingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BacktestingServiceBlockingStub(channel, callOptions);
        }
      };
    return BacktestingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BacktestingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BacktestingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BacktestingServiceFutureStub>() {
        @java.lang.Override
        public BacktestingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BacktestingServiceFutureStub(channel, callOptions);
        }
      };
    return BacktestingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * -------- Backtesting --------
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void startBacktest(com.trading.contracts.v1.StartBacktestRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.StartBacktestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartBacktestMethod(), responseObserver);
    }

    /**
     */
    default void getBacktest(com.trading.contracts.v1.GetBacktestRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.GetBacktestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBacktestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BacktestingService.
   * <pre>
   * -------- Backtesting --------
   * </pre>
   */
  public static abstract class BacktestingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BacktestingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BacktestingService.
   * <pre>
   * -------- Backtesting --------
   * </pre>
   */
  public static final class BacktestingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BacktestingServiceStub> {
    private BacktestingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BacktestingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BacktestingServiceStub(channel, callOptions);
    }

    /**
     */
    public void startBacktest(com.trading.contracts.v1.StartBacktestRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.StartBacktestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartBacktestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBacktest(com.trading.contracts.v1.GetBacktestRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.GetBacktestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBacktestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BacktestingService.
   * <pre>
   * -------- Backtesting --------
   * </pre>
   */
  public static final class BacktestingServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<BacktestingServiceBlockingV2Stub> {
    private BacktestingServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BacktestingServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BacktestingServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.trading.contracts.v1.StartBacktestResponse startBacktest(com.trading.contracts.v1.StartBacktestRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getStartBacktestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trading.contracts.v1.GetBacktestResponse getBacktest(com.trading.contracts.v1.GetBacktestRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetBacktestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service BacktestingService.
   * <pre>
   * -------- Backtesting --------
   * </pre>
   */
  public static final class BacktestingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BacktestingServiceBlockingStub> {
    private BacktestingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BacktestingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BacktestingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.trading.contracts.v1.StartBacktestResponse startBacktest(com.trading.contracts.v1.StartBacktestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartBacktestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trading.contracts.v1.GetBacktestResponse getBacktest(com.trading.contracts.v1.GetBacktestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBacktestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BacktestingService.
   * <pre>
   * -------- Backtesting --------
   * </pre>
   */
  public static final class BacktestingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BacktestingServiceFutureStub> {
    private BacktestingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BacktestingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BacktestingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trading.contracts.v1.StartBacktestResponse> startBacktest(
        com.trading.contracts.v1.StartBacktestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartBacktestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trading.contracts.v1.GetBacktestResponse> getBacktest(
        com.trading.contracts.v1.GetBacktestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBacktestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_BACKTEST = 0;
  private static final int METHODID_GET_BACKTEST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_BACKTEST:
          serviceImpl.startBacktest((com.trading.contracts.v1.StartBacktestRequest) request,
              (io.grpc.stub.StreamObserver<com.trading.contracts.v1.StartBacktestResponse>) responseObserver);
          break;
        case METHODID_GET_BACKTEST:
          serviceImpl.getBacktest((com.trading.contracts.v1.GetBacktestRequest) request,
              (io.grpc.stub.StreamObserver<com.trading.contracts.v1.GetBacktestResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStartBacktestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trading.contracts.v1.StartBacktestRequest,
              com.trading.contracts.v1.StartBacktestResponse>(
                service, METHODID_START_BACKTEST)))
        .addMethod(
          getGetBacktestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trading.contracts.v1.GetBacktestRequest,
              com.trading.contracts.v1.GetBacktestResponse>(
                service, METHODID_GET_BACKTEST)))
        .build();
  }

  private static abstract class BacktestingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BacktestingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.trading.contracts.v1.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BacktestingService");
    }
  }

  private static final class BacktestingServiceFileDescriptorSupplier
      extends BacktestingServiceBaseDescriptorSupplier {
    BacktestingServiceFileDescriptorSupplier() {}
  }

  private static final class BacktestingServiceMethodDescriptorSupplier
      extends BacktestingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BacktestingServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BacktestingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BacktestingServiceFileDescriptorSupplier())
              .addMethod(getStartBacktestMethod())
              .addMethod(getGetBacktestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
