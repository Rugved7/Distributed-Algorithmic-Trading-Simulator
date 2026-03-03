package com.trading.contracts.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * -------- Strategy --------
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class StrategyServiceGrpc {

  private StrategyServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "trading.v1.StrategyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.trading.contracts.v1.GetStrategyRequest,
      com.trading.contracts.v1.GetStrategyResponse> getGetStrategyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStrategy",
      requestType = com.trading.contracts.v1.GetStrategyRequest.class,
      responseType = com.trading.contracts.v1.GetStrategyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trading.contracts.v1.GetStrategyRequest,
      com.trading.contracts.v1.GetStrategyResponse> getGetStrategyMethod() {
    io.grpc.MethodDescriptor<com.trading.contracts.v1.GetStrategyRequest, com.trading.contracts.v1.GetStrategyResponse> getGetStrategyMethod;
    if ((getGetStrategyMethod = StrategyServiceGrpc.getGetStrategyMethod) == null) {
      synchronized (StrategyServiceGrpc.class) {
        if ((getGetStrategyMethod = StrategyServiceGrpc.getGetStrategyMethod) == null) {
          StrategyServiceGrpc.getGetStrategyMethod = getGetStrategyMethod =
              io.grpc.MethodDescriptor.<com.trading.contracts.v1.GetStrategyRequest, com.trading.contracts.v1.GetStrategyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStrategy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.GetStrategyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.GetStrategyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StrategyServiceMethodDescriptorSupplier("GetStrategy"))
              .build();
        }
      }
    }
    return getGetStrategyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StrategyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StrategyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StrategyServiceStub>() {
        @java.lang.Override
        public StrategyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StrategyServiceStub(channel, callOptions);
        }
      };
    return StrategyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static StrategyServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StrategyServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StrategyServiceBlockingV2Stub>() {
        @java.lang.Override
        public StrategyServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StrategyServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return StrategyServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StrategyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StrategyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StrategyServiceBlockingStub>() {
        @java.lang.Override
        public StrategyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StrategyServiceBlockingStub(channel, callOptions);
        }
      };
    return StrategyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StrategyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StrategyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StrategyServiceFutureStub>() {
        @java.lang.Override
        public StrategyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StrategyServiceFutureStub(channel, callOptions);
        }
      };
    return StrategyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * -------- Strategy --------
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getStrategy(com.trading.contracts.v1.GetStrategyRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.GetStrategyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStrategyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StrategyService.
   * <pre>
   * -------- Strategy --------
   * </pre>
   */
  public static abstract class StrategyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StrategyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StrategyService.
   * <pre>
   * -------- Strategy --------
   * </pre>
   */
  public static final class StrategyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StrategyServiceStub> {
    private StrategyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StrategyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StrategyServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStrategy(com.trading.contracts.v1.GetStrategyRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.GetStrategyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStrategyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StrategyService.
   * <pre>
   * -------- Strategy --------
   * </pre>
   */
  public static final class StrategyServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<StrategyServiceBlockingV2Stub> {
    private StrategyServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StrategyServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StrategyServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.trading.contracts.v1.GetStrategyResponse getStrategy(com.trading.contracts.v1.GetStrategyRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetStrategyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service StrategyService.
   * <pre>
   * -------- Strategy --------
   * </pre>
   */
  public static final class StrategyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StrategyServiceBlockingStub> {
    private StrategyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StrategyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StrategyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.trading.contracts.v1.GetStrategyResponse getStrategy(com.trading.contracts.v1.GetStrategyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStrategyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StrategyService.
   * <pre>
   * -------- Strategy --------
   * </pre>
   */
  public static final class StrategyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StrategyServiceFutureStub> {
    private StrategyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StrategyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StrategyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trading.contracts.v1.GetStrategyResponse> getStrategy(
        com.trading.contracts.v1.GetStrategyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStrategyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STRATEGY = 0;

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
        case METHODID_GET_STRATEGY:
          serviceImpl.getStrategy((com.trading.contracts.v1.GetStrategyRequest) request,
              (io.grpc.stub.StreamObserver<com.trading.contracts.v1.GetStrategyResponse>) responseObserver);
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
          getGetStrategyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trading.contracts.v1.GetStrategyRequest,
              com.trading.contracts.v1.GetStrategyResponse>(
                service, METHODID_GET_STRATEGY)))
        .build();
  }

  private static abstract class StrategyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StrategyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.trading.contracts.v1.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StrategyService");
    }
  }

  private static final class StrategyServiceFileDescriptorSupplier
      extends StrategyServiceBaseDescriptorSupplier {
    StrategyServiceFileDescriptorSupplier() {}
  }

  private static final class StrategyServiceMethodDescriptorSupplier
      extends StrategyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StrategyServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StrategyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StrategyServiceFileDescriptorSupplier())
              .addMethod(getGetStrategyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
