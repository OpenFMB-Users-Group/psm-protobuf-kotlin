// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializeoptionalValidityKind")
public inline fun optionalValidityKind(block: openfmb.commonmodule.Optional_ValidityKindKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.Optional_ValidityKind =
  openfmb.commonmodule.Optional_ValidityKindKt.Dsl._create(openfmb.commonmodule.Optional_ValidityKind.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `commonmodule.Optional_ValidityKind`
 */
public object Optional_ValidityKindKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.Optional_ValidityKind.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.Optional_ValidityKind.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.Optional_ValidityKind = _builder.build()

    /**
     * `.commonmodule.ValidityKind value = 1;`
     */
    public var value: openfmb.commonmodule.ValidityKind
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
     * `.commonmodule.ValidityKind value = 1;`
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.Optional_ValidityKind.copy(block: openfmb.commonmodule.Optional_ValidityKindKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.Optional_ValidityKind =
  openfmb.commonmodule.Optional_ValidityKindKt.Dsl._create(this.toBuilder()).apply { block() }._build()

