// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: solarmodule/solarmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.solarmodule;

@kotlin.jvm.JvmName("-initializesolarStatus")
public inline fun solarStatus(block: openfmb.solarmodule.SolarStatusKt.Dsl.() -> kotlin.Unit): openfmb.solarmodule.SolarStatus =
  openfmb.solarmodule.SolarStatusKt.Dsl._create(openfmb.solarmodule.SolarStatus.newBuilder()).apply { block() }._build()
/**
 * ```
 * Solar status
 * ```
 *
 * Protobuf type `solarmodule.SolarStatus`
 */
public object SolarStatusKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.solarmodule.SolarStatus.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.solarmodule.SolarStatus.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.solarmodule.SolarStatus = _builder.build()

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
     * `.solarmodule.SolarStatusZGEN solarStatusZGEN = 2;`
     */
    public var solarStatusZGEN: openfmb.solarmodule.SolarStatusZGEN
      @JvmName("getSolarStatusZGEN")
      get() = _builder.getSolarStatusZGEN()
      @JvmName("setSolarStatusZGEN")
      set(value) {
        _builder.setSolarStatusZGEN(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.solarmodule.SolarStatusZGEN solarStatusZGEN = 2;`
     */
    public fun clearSolarStatusZGEN() {
      _builder.clearSolarStatusZGEN()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.solarmodule.SolarStatusZGEN solarStatusZGEN = 2;`
     * @return Whether the solarStatusZGEN field is set.
     */
    public fun hasSolarStatusZGEN(): kotlin.Boolean {
      return _builder.hasSolarStatusZGEN()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.solarmodule.SolarStatus.copy(block: openfmb.solarmodule.SolarStatusKt.Dsl.() -> kotlin.Unit): openfmb.solarmodule.SolarStatus =
  openfmb.solarmodule.SolarStatusKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.solarmodule.SolarStatusOrBuilder.statusValueOrNull: openfmb.commonmodule.StatusValue?
  get() = if (hasStatusValue()) getStatusValue() else null

public val openfmb.solarmodule.SolarStatusOrBuilder.solarStatusZGENOrNull: openfmb.solarmodule.SolarStatusZGEN?
  get() = if (hasSolarStatusZGEN()) getSolarStatusZGEN() else null

