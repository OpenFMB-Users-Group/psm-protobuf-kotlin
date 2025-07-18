// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: circuitsegmentservicemodule/circuitsegmentservicemodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.circuitsegmentservicemodule;

@kotlin.jvm.JvmName("-initializeeNGCircuitSegmentServiceModeKind")
public inline fun eNGCircuitSegmentServiceModeKind(block: openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKindKt.Dsl.() -> kotlin.Unit): openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKind =
  openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKindKt.Dsl._create(openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKind.newBuilder()).apply { block() }._build()
/**
 * ```
 * Circuit Segment service mode kind
 * ```
 *
 * Protobuf type `circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKind`
 */
public object ENG_CircuitSegmentServiceModeKindKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKind.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKind.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKind = _builder.build()

    /**
     * ```
     * The value of the coordination service mode.
     * ```
     *
     * `.circuitsegmentservicemodule.CircuitSegmentServiceModeKind setVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var setVal: openfmb.circuitsegmentservicemodule.CircuitSegmentServiceModeKind
      @JvmName("getSetVal")
      get() = _builder.getSetVal()
      @JvmName("setSetVal")
      set(value) {
        _builder.setSetVal(value)
      }
    public var setValValue: kotlin.Int
      @JvmName("getSetValValue")
      get() = _builder.getSetValValue()
      @JvmName("setSetValValue")
      set(value) {
        _builder.setSetValValue(value)
      }
    /**
     * ```
     * The value of the coordination service mode.
     * ```
     *
     * `.circuitsegmentservicemodule.CircuitSegmentServiceModeKind setVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearSetVal() {
      _builder.clearSetVal()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.StringValue setValExtension = 2;`
     */
    public var setValExtension: com.google.protobuf.StringValue
      @JvmName("getSetValExtension")
      get() = _builder.getSetValExtension()
      @JvmName("setSetValExtension")
      set(value) {
        _builder.setSetValExtension(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.StringValue setValExtension = 2;`
     */
    public fun clearSetValExtension() {
      _builder.clearSetValExtension()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.StringValue setValExtension = 2;`
     * @return Whether the setValExtension field is set.
     */
    public fun hasSetValExtension(): kotlin.Boolean {
      return _builder.hasSetValExtension()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKind.copy(block: openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKindKt.Dsl.() -> kotlin.Unit): openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKind =
  openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKindKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.circuitsegmentservicemodule.ENG_CircuitSegmentServiceModeKindOrBuilder.setValExtensionOrNull: com.google.protobuf.StringValue?
  get() = if (hasSetValExtension()) getSetValExtension() else null

