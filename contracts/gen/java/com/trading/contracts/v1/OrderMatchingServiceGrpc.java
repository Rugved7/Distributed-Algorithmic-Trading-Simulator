package com.trading.contracts.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * -------- Order Matching --------
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderMatchingServiceGrpc {

  private OrderMatchingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "trading.v1.OrderMatchingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.trading.contracts.v1.SubmitOrderRequest,
      com.trading.contracts.v1.SubmitOrderResponse> getSubmitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitOrder",
      requestType = com.trading.contracts.v1.SubmitOrderRequest.class,
      responseType = com.trading.contracts.v1.SubmitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trading.contracts.v1.SubmitOrderRequest,
      com.trading.contracts.v1.SubmitOrderResponse> getSubmitOrderMethod() {
    io.grpc.MethodDescriptor<com.trading.contracts.v1.SubmitOrderRequest, com.trading.contracts.v1.SubmitOrderResponse> getSubmitOrderMethod;
    if ((getSubmitOrderMethod = OrderMatchingServiceGrpc.getSubmitOrderMethod) == null) {
      synchronized (OrderMatchingServiceGrpc.class) {
        if ((getSubmitOrderMethod = OrderMatchingServiceGrpc.getSubmitOrderMethod) == null) {
          OrderMatchingServiceGrpc.getSubmitOrderMethod = getSubmitOrderMethod =
              io.grpc.MethodDescriptor.<com.trading.contracts.v1.SubmitOrderRequest, com.trading.contracts.v1.SubmitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.SubmitOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.SubmitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderMatchingServiceMethodDescriptorSupplier("SubmitOrder"))
              .build();
        }
      }
    }
    return getSubmitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trading.contracts.v1.CancelOrderRequest,
      com.trading.contracts.v1.CancelOrderResponse> getCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOrder",
      requestType = com.trading.contracts.v1.CancelOrderRequest.class,
      responseType = com.trading.contracts.v1.CancelOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trading.contracts.v1.CancelOrderRequest,
      com.trading.contracts.v1.CancelOrderResponse> getCancelOrderMethod() {
    io.grpc.MethodDescriptor<com.trading.contracts.v1.CancelOrderRequest, com.trading.contracts.v1.CancelOrderResponse> getCancelOrderMethod;
    if ((getCancelOrderMethod = OrderMatchingServiceGrpc.getCancelOrderMethod) == null) {
      synchronized (OrderMatchingServiceGrpc.class) {
        if ((getCancelOrderMethod = OrderMatchingServiceGrpc.getCancelOrderMethod) == null) {
          OrderMatchingServiceGrpc.getCancelOrderMethod = getCancelOrderMethod =
              io.grpc.MethodDescriptor.<com.trading.contracts.v1.CancelOrderRequest, com.trading.contracts.v1.CancelOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.CancelOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trading.contracts.v1.CancelOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderMatchingServiceMethodDescriptorSupplier("CancelOrder"))
              .build();
        }
      }
    }
    return getCancelOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderMatchingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderMatchingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderMatchingServiceStub>() {
        @java.lang.Override
        public OrderMatchingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderMatchingServiceStub(channel, callOptions);
        }
      };
    return OrderMatchingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static OrderMatchingServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderMatchingServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderMatchingServiceBlockingV2Stub>() {
        @java.lang.Override
        public OrderMatchingServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderMatchingServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return OrderMatchingServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderMatchingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderMatchingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderMatchingServiceBlockingStub>() {
        @java.lang.Override
        public OrderMatchingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderMatchingServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderMatchingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderMatchingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderMatchingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderMatchingServiceFutureStub>() {
        @java.lang.Override
        public OrderMatchingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderMatchingServiceFutureStub(channel, callOptions);
        }
      };
    return OrderMatchingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * -------- Order Matching --------
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void submitOrder(com.trading.contracts.v1.SubmitOrderRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.SubmitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitOrderMethod(), responseObserver);
    }

    /**
     */
    default void cancelOrder(com.trading.contracts.v1.CancelOrderRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.CancelOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOrderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrderMatchingService.
   * <pre>
   * -------- Order Matching --------
   * </pre>
   */
  public static abstract class OrderMatchingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrderMatchingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrderMatchingService.
   * <pre>
   * -------- Order Matching --------
   * </pre>
   */
  public static final class OrderMatchingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OrderMatchingServiceStub> {
    private OrderMatchingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderMatchingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderMatchingServiceStub(channel, callOptions);
    }

    /**
     */
    public void submitOrder(com.trading.contracts.v1.SubmitOrderRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.SubmitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelOrder(com.trading.contracts.v1.CancelOrderRequest request,
        io.grpc.stub.StreamObserver<com.trading.contracts.v1.CancelOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrderMatchingService.
   * <pre>
   * -------- Order Matching --------
   * </pre>
   */
  public static final class OrderMatchingServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<OrderMatchingServiceBlockingV2Stub> {
    private OrderMatchingServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderMatchingServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderMatchingServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.trading.contracts.v1.SubmitOrderResponse submitOrder(com.trading.contracts.v1.SubmitOrderRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSubmitOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trading.contracts.v1.CancelOrderResponse cancelOrder(com.trading.contracts.v1.CancelOrderRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCancelOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service OrderMatchingService.
   * <pre>
   * -------- Order Matching --------
   * </pre>
   */
  public static final class OrderMatchingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrderMatchingServiceBlockingStub> {
    private OrderMatchingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderMatchingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderMatchingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.trading.contracts.v1.SubmitOrderResponse submitOrder(com.trading.contracts.v1.SubmitOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trading.contracts.v1.CancelOrderResponse cancelOrder(com.trading.contracts.v1.CancelOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrderMatchingService.
   * <pre>
   * -------- Order Matching --------
   * </pre>
   */
  public static final class OrderMatchingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrderMatchingServiceFutureStub> {
    private OrderMatchingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderMatchingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderMatchingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trading.contracts.v1.SubmitOrderResponse> submitOrder(
        com.trading.contracts.v1.SubmitOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trading.contracts.v1.CancelOrderResponse> cancelOrder(
        com.trading.contracts.v1.CancelOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_ORDER = 0;
  private static final int METHODID_CANCEL_ORDER = 1;

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
        case METHODID_SUBMIT_ORDER:
          serviceImpl.submitOrder((com.trading.contracts.v1.SubmitOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.trading.contracts.v1.SubmitOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_ORDER:
          serviceImpl.cancelOrder((com.trading.contracts.v1.CancelOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.trading.contracts.v1.CancelOrderResponse>) responseObserver);
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
          getSubmitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trading.contracts.v1.SubmitOrderRequest,
              com.trading.contracts.v1.SubmitOrderResponse>(
                service, METHODID_SUBMIT_ORDER)))
        .addMethod(
          getCancelOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trading.contracts.v1.CancelOrderRequest,
              com.trading.contracts.v1.CancelOrderResponse>(
                service, METHODID_CANCEL_ORDER)))
        .build();
  }

  private static abstract class OrderMatchingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderMatchingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.trading.contracts.v1.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderMatchingService");
    }
  }

  private static final class OrderMatchingServiceFileDescriptorSupplier
      extends OrderMatchingServiceBaseDescriptorSupplier {
    OrderMatchingServiceFileDescriptorSupplier() {}
  }

  private static final class OrderMatchingServiceMethodDescriptorSupplier
      extends OrderMatchingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrderMatchingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OrderMatchingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderMatchingServiceFileDescriptorSupplier())
              .addMethod(getSubmitOrderMethod())
              .addMethod(getCancelOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
