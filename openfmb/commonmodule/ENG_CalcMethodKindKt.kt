// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializeeNGCalcMethodKind")
public inline fun eNGCalcMethodKind(block: openfmb.commonmodule.ENG_CalcMethodKindKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.ENG_CalcMethodKind =
  openfmb.commonmodule.ENG_CalcMethodKindKt.Dsl._create(openfmb.commonmodule.ENG_CalcMethodKind.newBuilder()).apply { block() }._build()
/**
 * ```
 * Calc method kind
 * ```
 *
 * Protobuf type `commonmodule.ENG_CalcMethodKind`
 */
public object ENG_CalcMethodKindKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.ENG_CalcMethodKind.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.ENG_CalcMethodKind.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.ENG_CalcMethodKind = _builder.build()

    /**
     * ```
     * The value of the status setting.
     * ```
     *
     * `.commonmodule.CalcMethodKind setVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var setVal: openfmb.commonmodule.CalcMethodKind
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
     * The value of the status setting.
     * ```
     *
     * `.commonmodule.CalcMethodKind setVal = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearSetVal() {
      _builder.clearSetVal()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.ENG_CalcMethodKind.copy(block: openfmb.commonmodule.ENG_CalcMethodKindKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.ENG_CalcMethodKind =
  openfmb.commonmodule.ENG_CalcMethodKindKt.Dsl._create(this.toBuilder()).apply { block() }._build()

