package services.eventlogs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: eventlogs.proto")
public final class EventLogsServiceGrpc {

  private EventLogsServiceGrpc() {}

  public static final String SERVICE_NAME = "eventlogs.EventLogsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<services.eventlogs.StatusRequest,
      services.eventlogs.StringResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatus",
      requestType = services.eventlogs.StatusRequest.class,
      responseType = services.eventlogs.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<services.eventlogs.StatusRequest,
      services.eventlogs.StringResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<services.eventlogs.StatusRequest, services.eventlogs.StringResponse> getGetStatusMethod;
    if ((getGetStatusMethod = EventLogsServiceGrpc.getGetStatusMethod) == null) {
      synchronized (EventLogsServiceGrpc.class) {
        if ((getGetStatusMethod = EventLogsServiceGrpc.getGetStatusMethod) == null) {
          EventLogsServiceGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<services.eventlogs.StatusRequest, services.eventlogs.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "eventlogs.EventLogsService", "getStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.eventlogs.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.eventlogs.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventLogsServiceMethodDescriptorSupplier("getStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<services.eventlogs.SearchRequest,
      services.eventlogs.StringResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = services.eventlogs.SearchRequest.class,
      responseType = services.eventlogs.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<services.eventlogs.SearchRequest,
      services.eventlogs.StringResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<services.eventlogs.SearchRequest, services.eventlogs.StringResponse> getSearchMethod;
    if ((getSearchMethod = EventLogsServiceGrpc.getSearchMethod) == null) {
      synchronized (EventLogsServiceGrpc.class) {
        if ((getSearchMethod = EventLogsServiceGrpc.getSearchMethod) == null) {
          EventLogsServiceGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<services.eventlogs.SearchRequest, services.eventlogs.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "eventlogs.EventLogsService", "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.eventlogs.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.eventlogs.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventLogsServiceMethodDescriptorSupplier("search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<services.eventlogs.AlertRequest,
      services.eventlogs.StringResponse> getAlertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "alert",
      requestType = services.eventlogs.AlertRequest.class,
      responseType = services.eventlogs.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<services.eventlogs.AlertRequest,
      services.eventlogs.StringResponse> getAlertMethod() {
    io.grpc.MethodDescriptor<services.eventlogs.AlertRequest, services.eventlogs.StringResponse> getAlertMethod;
    if ((getAlertMethod = EventLogsServiceGrpc.getAlertMethod) == null) {
      synchronized (EventLogsServiceGrpc.class) {
        if ((getAlertMethod = EventLogsServiceGrpc.getAlertMethod) == null) {
          EventLogsServiceGrpc.getAlertMethod = getAlertMethod = 
              io.grpc.MethodDescriptor.<services.eventlogs.AlertRequest, services.eventlogs.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "eventlogs.EventLogsService", "alert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.eventlogs.AlertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.eventlogs.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventLogsServiceMethodDescriptorSupplier("alert"))
                  .build();
          }
        }
     }
     return getAlertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventLogsServiceStub newStub(io.grpc.Channel channel) {
    return new EventLogsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventLogsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventLogsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventLogsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventLogsServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class EventLogsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStatus(services.eventlogs.StatusRequest request,
        io.grpc.stub.StreamObserver<services.eventlogs.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     */
    public void search(services.eventlogs.SearchRequest request,
        io.grpc.stub.StreamObserver<services.eventlogs.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void alert(services.eventlogs.AlertRequest request,
        io.grpc.stub.StreamObserver<services.eventlogs.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAlertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                services.eventlogs.StatusRequest,
                services.eventlogs.StringResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                services.eventlogs.SearchRequest,
                services.eventlogs.StringResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getAlertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                services.eventlogs.AlertRequest,
                services.eventlogs.StringResponse>(
                  this, METHODID_ALERT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class EventLogsServiceStub extends io.grpc.stub.AbstractStub<EventLogsServiceStub> {
    private EventLogsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventLogsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventLogsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventLogsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStatus(services.eventlogs.StatusRequest request,
        io.grpc.stub.StreamObserver<services.eventlogs.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(services.eventlogs.SearchRequest request,
        io.grpc.stub.StreamObserver<services.eventlogs.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void alert(services.eventlogs.AlertRequest request,
        io.grpc.stub.StreamObserver<services.eventlogs.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class EventLogsServiceBlockingStub extends io.grpc.stub.AbstractStub<EventLogsServiceBlockingStub> {
    private EventLogsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventLogsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventLogsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventLogsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public services.eventlogs.StringResponse getStatus(services.eventlogs.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public services.eventlogs.StringResponse search(services.eventlogs.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public services.eventlogs.StringResponse alert(services.eventlogs.AlertRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlertMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class EventLogsServiceFutureStub extends io.grpc.stub.AbstractStub<EventLogsServiceFutureStub> {
    private EventLogsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventLogsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventLogsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventLogsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.eventlogs.StringResponse> getStatus(
        services.eventlogs.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.eventlogs.StringResponse> search(
        services.eventlogs.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.eventlogs.StringResponse> alert(
        services.eventlogs.AlertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_ALERT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventLogsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventLogsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((services.eventlogs.StatusRequest) request,
              (io.grpc.stub.StreamObserver<services.eventlogs.StringResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((services.eventlogs.SearchRequest) request,
              (io.grpc.stub.StreamObserver<services.eventlogs.StringResponse>) responseObserver);
          break;
        case METHODID_ALERT:
          serviceImpl.alert((services.eventlogs.AlertRequest) request,
              (io.grpc.stub.StreamObserver<services.eventlogs.StringResponse>) responseObserver);
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

  private static abstract class EventLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventLogsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return services.eventlogs.EventlogsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventLogsService");
    }
  }

  private static final class EventLogsServiceFileDescriptorSupplier
      extends EventLogsServiceBaseDescriptorSupplier {
    EventLogsServiceFileDescriptorSupplier() {}
  }

  private static final class EventLogsServiceMethodDescriptorSupplier
      extends EventLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventLogsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventLogsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventLogsServiceFileDescriptorSupplier())
              .addMethod(getGetStatusMethod())
              .addMethod(getSearchMethod())
              .addMethod(getAlertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
