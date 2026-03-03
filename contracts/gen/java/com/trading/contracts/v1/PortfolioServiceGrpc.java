package com.trading.contracts.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * -------- Portfolio --------
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class PortfolioServiceGrpc {

  private PortfolioServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "trading.v1.PortfolioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.trading.contracts.v1.GetPortfolioRequest,
      com.trading.contracts.v1.GetPortfolioResponse> getGetPortfolioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortfolio",
      requestType = com.trading.contracts.v1.GetPortfolioRequest.class,
      responseType = com.trading.contracts.v1.GetPortfolioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trading.contracts.v1.GetPortfolioRequest,
      com.trading.contracts.v1.GetPortfolioResponse> getGetPortfolioMethod() {
    io.grpc.MethodDescriptor<com.trading.contracts.v1.GetPortfolioRequest, com.trading.contracts.v1.GetPortfolioResponse> getGetPortfolioMethod;
    if ((getGetPortfolioMethod = PortfolioServiceGrpc.getGetPortfolioMethod) == null) {
      synchronized (PortfolioServiceGrpc.class) {
        if ((getGetPortfolioMethod = PortfolioServiceGrpc.getGetPortfolioMethod) == null) {
          PortfolioServiceGrpc.getGetPortfolioMethod = getGetPortfolioMethod =
              io.grpc.MethodDescriptor.<com.trading.contracts.v1.GetPortfolioRequest, com.trading.contracts.v1.GetPortfolioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortfolio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.GetPortfolioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.GetPortfolioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PortfolioServiceMethodDescriptorSupplier("GetPortfolio"))
              .build();
        }
      }
    }
    return getGetPortfolioMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PortfolioServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PortfolioServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PortfolioServiceStub>() {
        @java.lang.Override
        public PortfolioServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PortfolioServiceStub(channel, callOptions);
        }
      };
    return PortfolioServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static PortfolioServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PortfolioServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PortfolioServiceBlockingV2Stub>() {
        @java.lang.Override
        public PortfolioServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PortfolioServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return PortfolioServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PortfolioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PortfolioServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PortfolioServiceBlockingStub>() {
        @java.lang.Override
        public PortfolioServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PortfolioServiceBlockingStub(channel, callOptions);
        }
      };
    return PortfolioServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PortfolioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PortfolioServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PortfolioServiceFutureStub>() {
        @java.lang.Override
        public PortfolioServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PortfolioServiceFutureStub(channel, callOptions);
        }
      };
    return PortfolioServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * -------- Portfolio --------
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getPortfolio(com.trading.contracts.v1.GetPortfolioRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.GetPortfolioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortfolioMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PortfolioService.
   * <pre>
   * -------- Portfolio --------
   * </pre>
   */
  public static abstract class PortfolioServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PortfolioServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PortfolioService.
   * <pre>
   * -------- Portfolio --------
   * </pre>
   */
  public static final class PortfolioServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PortfolioServiceStub> {
    private PortfolioServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortfolioServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PortfolioServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPortfolio(com.trading.contracts.v1.GetPortfolioRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.GetPortfolioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortfolioMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PortfolioService.
   * <pre>
   * -------- Portfolio --------
   * </pre>
   */
  public static final class PortfolioServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<PortfolioServiceBlockingV2Stub> {
    private PortfolioServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortfolioServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PortfolioServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.trading.contracts.v1.GetPortfolioResponse getPortfolio(com.trading.contracts.v1.GetPortfolioRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPortfolioMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service PortfolioService.
   * <pre>
   * -------- Portfolio --------
   * </pre>
   */
  public static final class PortfolioServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PortfolioServiceBlockingStub> {
    private PortfolioServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortfolioServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PortfolioServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.trading.contracts.v1.GetPortfolioResponse getPortfolio(com.trading.contracts.v1.GetPortfolioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortfolioMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PortfolioService.
   * <pre>
   * -------- Portfolio --------
   * </pre>
   */
  public static final class PortfolioServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PortfolioServiceFutureStub> {
    private PortfolioServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortfolioServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PortfolioServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trading.contracts.v1.GetPortfolioResponse> getPortfolio(
        com.trading.contracts.v1.GetPortfolioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortfolioMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PORTFOLIO = 0;

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
        case METHODID_GET_PORTFOLIO:
          serviceImpl.getPortfolio((com.trading.contracts.v1.GetPortfolioRequest) request,
              (io.grpc.stub.StreamObserver<com.trading.contracts.v1.GetPortfolioResponse>) responseObserver);
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
          getGetPortfolioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trading.contracts.v1.GetPortfolioRequest,
              com.trading.contracts.v1.GetPortfolioResponse>(
                service, METHODID_GET_PORTFOLIO)))
        .build();
  }

  private static abstract class PortfolioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PortfolioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.trading.contracts.v1.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PortfolioService");
    }
  }

  private static final class PortfolioServiceFileDescriptorSupplier
      extends PortfolioServiceBaseDescriptorSupplier {
    PortfolioServiceFileDescriptorSupplier() {}
  }

  private static final class PortfolioServiceMethodDescriptorSupplier
      extends PortfolioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PortfolioServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PortfolioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PortfolioServiceFileDescriptorSupplier())
              .addMethod(getGetPortfolioMethod())
              .build();
        }
      }
    }
    return result;
  }
}
