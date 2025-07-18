// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: commonmodule/commonmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.commonmodule;

@kotlin.jvm.JvmName("-initializeeNSHealthKind")
public inline fun eNSHealthKind(block: openfmb.commonmodule.ENS_HealthKindKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.ENS_HealthKind =
  openfmb.commonmodule.ENS_HealthKindKt.Dsl._create(openfmb.commonmodule.ENS_HealthKind.newBuilder()).apply { block() }._build()
/**
 * ```
 * &lt;&gt; Enumerated status (ENS)
 * ```
 *
 * Protobuf type `commonmodule.ENS_HealthKind`
 */
public object ENS_HealthKindKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.commonmodule.ENS_HealthKind.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.commonmodule.ENS_HealthKind.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.commonmodule.ENS_HealthKind = _builder.build()

    /**
     * ```
     * Textual description of the data. In case it is used within the CDC LPL, the description refers
     * to the logical node.
     * ```
     *
     * `.google.protobuf.StringValue d = 1;`
     */
    public var d: com.google.protobuf.StringValue
      @JvmName("getD")
      get() = _builder.getD()
      @JvmName("setD")
      set(value) {
        _builder.setD(value)
      }
    /**
     * ```
     * Textual description of the data. In case it is used within the CDC LPL, the description refers
     * to the logical node.
     * ```
     *
     * `.google.protobuf.StringValue d = 1;`
     */
    public fun clearD() {
      _builder.clearD()
    }
    /**
     * ```
     * Textual description of the data. In case it is used within the CDC LPL, the description refers
     * to the logical node.
     * ```
     *
     * `.google.protobuf.StringValue d = 1;`
     * @return Whether the d field is set.
     */
    public fun hasD(): kotlin.Boolean {
      return _builder.hasD()
    }

    /**
     * ```
     * Value of the data.
     * ```
     *
     * `.commonmodule.HealthKind stVal = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var stVal: openfmb.commonmodule.HealthKind
      @JvmName("getStVal")
      get() = _builder.getStVal()
      @JvmName("setStVal")
      set(value) {
        _builder.setStVal(value)
      }
    public var stValValue: kotlin.Int
      @JvmName("getStValValue")
      get() = _builder.getStValValue()
      @JvmName("setStValValue")
      set(value) {
        _builder.setStValValue(value)
      }
    /**
     * ```
     * Value of the data.
     * ```
     *
     * `.commonmodule.HealthKind stVal = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearStVal() {
      _builder.clearStVal()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.commonmodule.ENS_HealthKind.copy(block: openfmb.commonmodule.ENS_HealthKindKt.Dsl.() -> kotlin.Unit): openfmb.commonmodule.ENS_HealthKind =
  openfmb.commonmodule.ENS_HealthKindKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.commonmodule.ENS_HealthKindOrBuilder.dOrNull: com.google.protobuf.StringValue?
  get() = if (hasD()) getD() else null

