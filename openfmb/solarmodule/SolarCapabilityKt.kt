// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: solarmodule/solarmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.solarmodule;

@kotlin.jvm.JvmName("-initializesolarCapability")
public inline fun solarCapability(block: openfmb.solarmodule.SolarCapabilityKt.Dsl.() -> kotlin.Unit): openfmb.solarmodule.SolarCapability =
  openfmb.solarmodule.SolarCapabilityKt.Dsl._create(openfmb.solarmodule.SolarCapability.newBuilder()).apply { block() }._build()
/**
 * ```
 * Generation capability
 * ```
 *
 * Protobuf type `solarmodule.SolarCapability`
 */
public object SolarCapabilityKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.solarmodule.SolarCapability.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.solarmodule.SolarCapability.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.solarmodule.SolarCapability = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.NameplateValue nameplateValue = 1 [(.uml.option_parent_message) = true];`
     */
    public var nameplateValue: openfmb.commonmodule.NameplateValue
      @JvmName("getNameplateValue")
      get() = _builder.getNameplateValue()
      @JvmName("setNameplateValue")
      set(value) {
        _builder.setNameplateValue(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.NameplateValue nameplateValue = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearNameplateValue() {
      _builder.clearNameplateValue()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.NameplateValue nameplateValue = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the nameplateValue field is set.
     */
    public fun hasNameplateValue(): kotlin.Boolean {
      return _builder.hasNameplateValue()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.solarmodule.SolarCapabilityConfiguration solarCapabilityConfiguration = 2;`
     */
    public var solarCapabilityConfiguration: openfmb.solarmodule.SolarCapabilityConfiguration
      @JvmName("getSolarCapabilityConfiguration")
      get() = _builder.getSolarCapabilityConfiguration()
      @JvmName("setSolarCapabilityConfiguration")
      set(value) {
        _builder.setSolarCapabilityConfiguration(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.solarmodule.SolarCapabilityConfiguration solarCapabilityConfiguration = 2;`
     */
    public fun clearSolarCapabilityConfiguration() {
      _builder.clearSolarCapabilityConfiguration()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.solarmodule.SolarCapabilityConfiguration solarCapabilityConfiguration = 2;`
     * @return Whether the solarCapabilityConfiguration field is set.
     */
    public fun hasSolarCapabilityConfiguration(): kotlin.Boolean {
      return _builder.hasSolarCapabilityConfiguration()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.solarmodule.SolarCapabilityRatings solarCapabilityRatings = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var solarCapabilityRatings: openfmb.solarmodule.SolarCapabilityRatings
      @JvmName("getSolarCapabilityRatings")
      get() = _builder.getSolarCapabilityRatings()
      @JvmName("setSolarCapabilityRatings")
      set(value) {
        _builder.setSolarCapabilityRatings(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.solarmodule.SolarCapabilityRatings solarCapabilityRatings = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearSolarCapabilityRatings() {
      _builder.clearSolarCapabilityRatings()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.solarmodule.SolarCapabilityRatings solarCapabilityRatings = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the solarCapabilityRatings field is set.
     */
    public fun hasSolarCapabilityRatings(): kotlin.Boolean {
      return _builder.hasSolarCapabilityRatings()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.solarmodule.SolarCapability.copy(block: openfmb.solarmodule.SolarCapabilityKt.Dsl.() -> kotlin.Unit): openfmb.solarmodule.SolarCapability =
  openfmb.solarmodule.SolarCapabilityKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.solarmodule.SolarCapabilityOrBuilder.nameplateValueOrNull: openfmb.commonmodule.NameplateValue?
  get() = if (hasNameplateValue()) getNameplateValue() else null

public val openfmb.solarmodule.SolarCapabilityOrBuilder.solarCapabilityConfigurationOrNull: openfmb.solarmodule.SolarCapabilityConfiguration?
  get() = if (hasSolarCapabilityConfiguration()) getSolarCapabilityConfiguration() else null

public val openfmb.solarmodule.SolarCapabilityOrBuilder.solarCapabilityRatingsOrNull: openfmb.solarmodule.SolarCapabilityRatings?
  get() = if (hasSolarCapabilityRatings()) getSolarCapabilityRatings() else null

