// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializeoptionalRealPowerControlKind")
public inline fun optionalRealPowerControlKind(block: openfmb.commonmodule.Optional_RealPowerControlKindKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.Optional_RealPowerControlKind =
  openfmb.commonmodule.Optional_RealPowerControlKindKt.Dsl._create(openfmb.commonmodule.Optional_RealPowerControlKind.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `commonmodule.Optional_RealPowerControlKind`
 */
public object Optional_RealPowerControlKindKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.Optional_RealPowerControlKind.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.Optional_RealPowerControlKind.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.Optional_RealPowerControlKind = _builder.build()

    /**
     * `.commonmodule.RealPowerControlKind value = 1;`
     */
    public var value: openfmb.commonmodule.RealPowerControlKind
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    public var valueValue: kotlin.Int
      @JvmName("getValueValue")
      get() = _builder.getValueValue()
      @JvmName("setValueValue")
      set(value) {
        _builder.setValueValue(value)
      }
    /**
     * `.commonmodule.RealPowerControlKind value = 1;`
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.Optional_RealPowerControlKind.copy(block: openfmb.commonmodule.Optional_RealPowerControlKindKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.Optional_RealPowerControlKind =
  openfmb.commonmodule.Optional_RealPowerControlKindKt.Dsl._create(this.toBuilder()).apply { block() }._build()

