// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializehzWPoint")
public inline fun hzWPoint(block: openfmb.commonmodule.HzWPointKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.HzWPoint =
  openfmb.commonmodule.HzWPointKt.Dsl._create(openfmb.commonmodule.HzWPoint.newBuilder()).apply { block() }._build()
/**
 * ```
 * MISSING DOCUMENTATION!!!
 * ```
 *
 * Protobuf type `commonmodule.HzWPoint`
 */
public object HzWPointKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.HzWPoint.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.HzWPoint.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.HzWPoint = _builder.build()

    /**
     * ```
     * This is an absolute value field
     * ```
     *
     * `float deadbandHzVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var deadbandHzVal: kotlin.Float
      @JvmName("getDeadbandHzVal")
      get() = _builder.getDeadbandHzVal()
      @JvmName("setDeadbandHzVal")
      set(value) {
        _builder.setDeadbandHzVal(value)
      }
    /**
     * ```
     * This is an absolute value field
     * ```
     *
     * `float deadbandHzVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearDeadbandHzVal() {
      _builder.clearDeadbandHzVal()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `float slopeVal = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var slopeVal: kotlin.Float
      @JvmName("getSlopeVal")
      get() = _builder.getSlopeVal()
      @JvmName("setSlopeVal")
      set(value) {
        _builder.setSlopeVal(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `float slopeVal = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearSlopeVal() {
      _builder.clearSlopeVal()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.HzWPoint.copy(block: openfmb.commonmodule.HzWPointKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.HzWPoint =
  openfmb.commonmodule.HzWPointKt.Dsl._create(this.toBuilder()).apply { block() }._build()

