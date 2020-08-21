package services.systemlogs;

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
    comments = "Source: systemlogs.proto")
public final class SystemLogsServiceGrpc {

  private SystemLogsServiceGrpc() {}

  public static final String SERVICE_NAME = "systemlogs.SystemLogsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<services.systemlogs.StatusRequest,
      services.systemlogs.StringResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatus",
      requestType = services.systemlogs.StatusRequest.class,
      responseType = services.systemlogs.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<services.systemlogs.StatusRequest,
      services.systemlogs.StringResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<services.systemlogs.StatusRequest, services.systemlogs.StringResponse> getGetStatusMethod;
    if ((getGetStatusMethod = SystemLogsServiceGrpc.getGetStatusMethod) == null) {
      synchronized (SystemLogsServiceGrpc.class) {
        if ((getGetStatusMethod = SystemLogsServiceGrpc.getGetStatusMethod) == null) {
          SystemLogsServiceGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<services.systemlogs.StatusRequest, services.systemlogs.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "systemlogs.SystemLogsService", "getStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.systemlogs.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.systemlogs.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SystemLogsServiceMethodDescriptorSupplier("getStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<services.systemlogs.StoreRequest,
      services.systemlogs.StringResponse> getStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "store",
      requestType = services.systemlogs.StoreRequest.class,
      responseType = services.systemlogs.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<services.systemlogs.StoreRequest,
      services.systemlogs.StringResponse> getStoreMethod() {
    io.grpc.MethodDescriptor<services.systemlogs.StoreRequest, services.systemlogs.StringResponse> getStoreMethod;
    if ((getStoreMethod = SystemLogsServiceGrpc.getStoreMethod) == null) {
      synchronized (SystemLogsServiceGrpc.class) {
        if ((getStoreMethod = SystemLogsServiceGrpc.getStoreMethod) == null) {
          SystemLogsServiceGrpc.getStoreMethod = getStoreMethod = 
              io.grpc.MethodDescriptor.<services.systemlogs.StoreRequest, services.systemlogs.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "systemlogs.SystemLogsService", "store"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.systemlogs.StoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.systemlogs.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SystemLogsServiceMethodDescriptorSupplier("store"))
                  .build();
          }
        }
     }
     return getStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<services.systemlogs.CreateReportRequest,
      services.systemlogs.StringResponse> getCreateReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createReport",
      requestType = services.systemlogs.CreateReportRequest.class,
      responseType = services.systemlogs.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<services.systemlogs.CreateReportRequest,
      services.systemlogs.StringResponse> getCreateReportMethod() {
    io.grpc.MethodDescriptor<services.systemlogs.CreateReportRequest, services.systemlogs.StringResponse> getCreateReportMethod;
    if ((getCreateReportMethod = SystemLogsServiceGrpc.getCreateReportMethod) == null) {
      synchronized (SystemLogsServiceGrpc.class) {
        if ((getCreateReportMethod = SystemLogsServiceGrpc.getCreateReportMethod) == null) {
          SystemLogsServiceGrpc.getCreateReportMethod = getCreateReportMethod = 
              io.grpc.MethodDescriptor.<services.systemlogs.CreateReportRequest, services.systemlogs.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "systemlogs.SystemLogsService", "createReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.systemlogs.CreateReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.systemlogs.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SystemLogsServiceMethodDescriptorSupplier("createReport"))
                  .build();
          }
        }
     }
     return getCreateReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<services.systemlogs.SpreadSheetRequest,
      services.systemlogs.StringResponse> getCreateLogSpreadSheetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createLogSpreadSheet",
      requestType = services.systemlogs.SpreadSheetRequest.class,
      responseType = services.systemlogs.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<services.systemlogs.SpreadSheetRequest,
      services.systemlogs.StringResponse> getCreateLogSpreadSheetMethod() {
    io.grpc.MethodDescriptor<services.systemlogs.SpreadSheetRequest, services.systemlogs.StringResponse> getCreateLogSpreadSheetMethod;
    if ((getCreateLogSpreadSheetMethod = SystemLogsServiceGrpc.getCreateLogSpreadSheetMethod) == null) {
      synchronized (SystemLogsServiceGrpc.class) {
        if ((getCreateLogSpreadSheetMethod = SystemLogsServiceGrpc.getCreateLogSpreadSheetMethod) == null) {
          SystemLogsServiceGrpc.getCreateLogSpreadSheetMethod = getCreateLogSpreadSheetMethod = 
              io.grpc.MethodDescriptor.<services.systemlogs.SpreadSheetRequest, services.systemlogs.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "systemlogs.SystemLogsService", "createLogSpreadSheet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.systemlogs.SpreadSheetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  services.systemlogs.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SystemLogsServiceMethodDescriptorSupplier("createLogSpreadSheet"))
                  .build();
          }
        }
     }
     return getCreateLogSpreadSheetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SystemLogsServiceStub newStub(io.grpc.Channel channel) {
    return new SystemLogsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SystemLogsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SystemLogsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SystemLogsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SystemLogsServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class SystemLogsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStatus(services.systemlogs.StatusRequest request,
        io.grpc.stub.StreamObserver<services.systemlogs.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     */
    public void store(services.systemlogs.StoreRequest request,
        io.grpc.stub.StreamObserver<services.systemlogs.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStoreMethod(), responseObserver);
    }

    /**
     */
    public void createReport(services.systemlogs.CreateReportRequest request,
        io.grpc.stub.StreamObserver<services.systemlogs.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateReportMethod(), responseObserver);
    }

    /**
     */
    public void createLogSpreadSheet(services.systemlogs.SpreadSheetRequest request,
        io.grpc.stub.StreamObserver<services.systemlogs.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateLogSpreadSheetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                services.systemlogs.StatusRequest,
                services.systemlogs.StringResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getStoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                services.systemlogs.StoreRequest,
                services.systemlogs.StringResponse>(
                  this, METHODID_STORE)))
          .addMethod(
            getCreateReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                services.systemlogs.CreateReportRequest,
                services.systemlogs.StringResponse>(
                  this, METHODID_CREATE_REPORT)))
          .addMethod(
            getCreateLogSpreadSheetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                services.systemlogs.SpreadSheetRequest,
                services.systemlogs.StringResponse>(
                  this, METHODID_CREATE_LOG_SPREAD_SHEET)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SystemLogsServiceStub extends io.grpc.stub.AbstractStub<SystemLogsServiceStub> {
    private SystemLogsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SystemLogsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemLogsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SystemLogsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStatus(services.systemlogs.StatusRequest request,
        io.grpc.stub.StreamObserver<services.systemlogs.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void store(services.systemlogs.StoreRequest request,
        io.grpc.stub.StreamObserver<services.systemlogs.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createReport(services.systemlogs.CreateReportRequest request,
        io.grpc.stub.StreamObserver<services.systemlogs.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createLogSpreadSheet(services.systemlogs.SpreadSheetRequest request,
        io.grpc.stub.StreamObserver<services.systemlogs.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateLogSpreadSheetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SystemLogsServiceBlockingStub extends io.grpc.stub.AbstractStub<SystemLogsServiceBlockingStub> {
    private SystemLogsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SystemLogsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemLogsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SystemLogsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public services.systemlogs.StringResponse getStatus(services.systemlogs.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public services.systemlogs.StringResponse store(services.systemlogs.StoreRequest request) {
      return blockingUnaryCall(
          getChannel(), getStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public services.systemlogs.StringResponse createReport(services.systemlogs.CreateReportRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public services.systemlogs.StringResponse createLogSpreadSheet(services.systemlogs.SpreadSheetRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateLogSpreadSheetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SystemLogsServiceFutureStub extends io.grpc.stub.AbstractStub<SystemLogsServiceFutureStub> {
    private SystemLogsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SystemLogsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemLogsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SystemLogsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.systemlogs.StringResponse> getStatus(
        services.systemlogs.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.systemlogs.StringResponse> store(
        services.systemlogs.StoreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.systemlogs.StringResponse> createReport(
        services.systemlogs.CreateReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateReportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.systemlogs.StringResponse> createLogSpreadSheet(
        services.systemlogs.SpreadSheetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateLogSpreadSheetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;
  private static final int METHODID_STORE = 1;
  private static final int METHODID_CREATE_REPORT = 2;
  private static final int METHODID_CREATE_LOG_SPREAD_SHEET = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SystemLogsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SystemLogsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((services.systemlogs.StatusRequest) request,
              (io.grpc.stub.StreamObserver<services.systemlogs.StringResponse>) responseObserver);
          break;
        case METHODID_STORE:
          serviceImpl.store((services.systemlogs.StoreRequest) request,
              (io.grpc.stub.StreamObserver<services.systemlogs.StringResponse>) responseObserver);
          break;
        case METHODID_CREATE_REPORT:
          serviceImpl.createReport((services.systemlogs.CreateReportRequest) request,
              (io.grpc.stub.StreamObserver<services.systemlogs.StringResponse>) responseObserver);
          break;
        case METHODID_CREATE_LOG_SPREAD_SHEET:
          serviceImpl.createLogSpreadSheet((services.systemlogs.SpreadSheetRequest) request,
              (io.grpc.stub.StreamObserver<services.systemlogs.StringResponse>) responseObserver);
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

  private static abstract class SystemLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SystemLogsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return services.systemlogs.SystemLogsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SystemLogsService");
    }
  }

  private static final class SystemLogsServiceFileDescriptorSupplier
      extends SystemLogsServiceBaseDescriptorSupplier {
    SystemLogsServiceFileDescriptorSupplier() {}
  }

  private static final class SystemLogsServiceMethodDescriptorSupplier
      extends SystemLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SystemLogsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SystemLogsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SystemLogsServiceFileDescriptorSupplier())
              .addMethod(getGetStatusMethod())
              .addMethod(getStoreMethod())
              .addMethod(getCreateReportMethod())
              .addMethod(getCreateLogSpreadSheetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
