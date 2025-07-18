// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: regulatormodule/regulatormodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.regulatormodule;

@kotlin.jvm.JvmName("-initializeregulatorStatus")
public inline fun regulatorStatus(block: openfmb.regulatormodule.RegulatorStatusKt.Dsl.() -> kotlin.Unit): openfmb.regulatormodule.RegulatorStatus =
  openfmb.regulatormodule.RegulatorStatusKt.Dsl._create(openfmb.regulatormodule.RegulatorStatus.newBuilder()).apply { block() }._build()
/**
 * ```
 * Regulator status
 * ```
 *
 * Protobuf type `regulatormodule.RegulatorStatus`
 */
public object RegulatorStatusKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.regulatormodule.RegulatorStatus.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.regulatormodule.RegulatorStatus.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.regulatormodule.RegulatorStatus = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.StatusValue statusValue = 1 [(.uml.option_parent_message) = true];`
     */
    public var statusValue: openfmb.commonmodule.StatusValue
      @JvmName("getStatusValue")
      get() = _builder.getStatusValue()
      @JvmName("setStatusValue")
      set(value) {
        _builder.setStatusValue(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.StatusValue statusValue = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearStatusValue() {
      _builder.clearStatusValue()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.StatusValue statusValue = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the statusValue field is set.
     */
    public fun hasStatusValue(): kotlin.Boolean {
      return _builder.hasStatusValue()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.regulatormodule.RegulatorEventAndStatusANCR regulatorEventAndStatusANCR = 2;`
     */
    public var regulatorEventAndStatusANCR: openfmb.regulatormodule.RegulatorEventAndStatusANCR
      @JvmName("getRegulatorEventAndStatusANCR")
      get() = _builder.getRegulatorEventAndStatusANCR()
      @JvmName("setRegulatorEventAndStatusANCR")
      set(value) {
        _builder.setRegulatorEventAndStatusANCR(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.regulatormodule.RegulatorEventAndStatusANCR regulatorEventAndStatusANCR = 2;`
     */
    public fun clearRegulatorEventAndStatusANCR() {
      _builder.clearRegulatorEventAndStatusANCR()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.regulatormodule.RegulatorEventAndStatusANCR regulatorEventAndStatusANCR = 2;`
     * @return Whether the regulatorEventAndStatusANCR field is set.
     */
    public fun hasRegulatorEventAndStatusANCR(): kotlin.Boolean {
      return _builder.hasRegulatorEventAndStatusANCR()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.regulatormodule.RegulatorStatus.copy(block: openfmb.regulatormodule.RegulatorStatusKt.Dsl.() -> kotlin.Unit): openfmb.regulatormodule.RegulatorStatus =
  openfmb.regulatormodule.RegulatorStatusKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.regulatormodule.RegulatorStatusOrBuilder.statusValueOrNull: openfmb.commonmodule.StatusValue?
  get() = if (hasStatusValue()) getStatusValue() else null

public val openfmb.regulatormodule.RegulatorStatusOrBuilder.regulatorEventAndStatusANCROrNull: openfmb.regulatormodule.RegulatorEventAndStatusANCR?
  get() = if (hasRegulatorEventAndStatusANCR()) getRegulatorEventAndStatusANCR() else null

