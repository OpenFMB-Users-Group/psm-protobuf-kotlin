// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializeoptionalFaultDirectionKind")
public inline fun optionalFaultDirectionKind(block: openfmb.commonmodule.Optional_FaultDirectionKindKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.Optional_FaultDirectionKind =
  openfmb.commonmodule.Optional_FaultDirectionKindKt.Dsl._create(openfmb.commonmodule.Optional_FaultDirectionKind.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `commonmodule.Optional_FaultDirectionKind`
 */
public object Optional_FaultDirectionKindKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.Optional_FaultDirectionKind.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.Optional_FaultDirectionKind.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.Optional_FaultDirectionKind = _builder.build()

    /**
     * `.commonmodule.FaultDirectionKind value = 1;`
     */
    public var value: openfmb.commonmodule.FaultDirectionKind
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
     * `.commonmodule.FaultDirectionKind value = 1;`
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.Optional_FaultDirectionKind.copy(block: openfmb.commonmodule.Optional_FaultDirectionKindKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.Optional_FaultDirectionKind =
  openfmb.commonmodule.Optional_FaultDirectionKindKt.Dsl._create(this.toBuilder()).apply { block() }._build()

