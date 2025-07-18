// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: interconnectionmodule/interconnectionmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.interconnectionmodule;

@kotlin.jvm.JvmName("-initializeinterconnectionPoint")
public inline fun interconnectionPoint(block: openfmb.interconnectionmodule.InterconnectionPointKt.Dsl.() -> kotlin.Unit): openfmb.interconnectionmodule.InterconnectionPoint =
  openfmb.interconnectionmodule.InterconnectionPointKt.Dsl._create(openfmb.interconnectionmodule.InterconnectionPoint.newBuilder()).apply { block() }._build()
/**
 * ```
 * Point definition (Point)
 * ```
 *
 * Protobuf type `interconnectionmodule.InterconnectionPoint`
 */
public object InterconnectionPointKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.interconnectionmodule.InterconnectionPoint.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.interconnectionmodule.InterconnectionPoint.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.interconnectionmodule.InterconnectionPoint = _builder.build()

    /**
     * ```
     * Black start enable
     * ```
     *
     * `.commonmodule.ControlSPC blackStartEnabled = 1;`
     */
    public var blackStartEnabled: openfmb.commonmodule.ControlSPC
      @JvmName("getBlackStartEnabled")
      get() = _builder.getBlackStartEnabled()
      @JvmName("setBlackStartEnabled")
      set(value) {
        _builder.setBlackStartEnabled(value)
      }
    /**
     * ```
     * Black start enable
     * ```
     *
     * `.commonmodule.ControlSPC blackStartEnabled = 1;`
     */
    public fun clearBlackStartEnabled() {
      _builder.clearBlackStartEnabled()
    }
    /**
     * ```
     * Black start enable
     * ```
     *
     * `.commonmodule.ControlSPC blackStartEnabled = 1;`
     * @return Whether the blackStartEnabled field is set.
     */
    public fun hasBlackStartEnabled(): kotlin.Boolean {
      return _builder.hasBlackStartEnabled()
    }

    /**
     * ```
     * Enable frequency set point
     * ```
     *
     * `.commonmodule.ControlSPC frequencySetPointEnabled = 2;`
     */
    public var frequencySetPointEnabled: openfmb.commonmodule.ControlSPC
      @JvmName("getFrequencySetPointEnabled")
      get() = _builder.getFrequencySetPointEnabled()
      @JvmName("setFrequencySetPointEnabled")
      set(value) {
        _builder.setFrequencySetPointEnabled(value)
      }
    /**
     * ```
     * Enable frequency set point
     * ```
     *
     * `.commonmodule.ControlSPC frequencySetPointEnabled = 2;`
     */
    public fun clearFrequencySetPointEnabled() {
      _builder.clearFrequencySetPointEnabled()
    }
    /**
     * ```
     * Enable frequency set point
     * ```
     *
     * `.commonmodule.ControlSPC frequencySetPointEnabled = 2;`
     * @return Whether the frequencySetPointEnabled field is set.
     */
    public fun hasFrequencySetPointEnabled(): kotlin.Boolean {
      return _builder.hasFrequencySetPointEnabled()
    }

    /**
     * ```
     * Island control
     * ```
     *
     * `.commonmodule.ControlSPC island = 3;`
     */
    public var island: openfmb.commonmodule.ControlSPC
      @JvmName("getIsland")
      get() = _builder.getIsland()
      @JvmName("setIsland")
      set(value) {
        _builder.setIsland(value)
      }
    /**
     * ```
     * Island control
     * ```
     *
     * `.commonmodule.ControlSPC island = 3;`
     */
    public fun clearIsland() {
      _builder.clearIsland()
    }
    /**
     * ```
     * Island control
     * ```
     *
     * `.commonmodule.ControlSPC island = 3;`
     * @return Whether the island field is set.
     */
    public fun hasIsland(): kotlin.Boolean {
      return _builder.hasIsland()
    }

    /**
     * ```
     * Black start enable
     * ```
     *
     * `.google.protobuf.FloatValue pctHzDroop = 4;`
     */
    public var pctHzDroop: com.google.protobuf.FloatValue
      @JvmName("getPctHzDroop")
      get() = _builder.getPctHzDroop()
      @JvmName("setPctHzDroop")
      set(value) {
        _builder.setPctHzDroop(value)
      }
    /**
     * ```
     * Black start enable
     * ```
     *
     * `.google.protobuf.FloatValue pctHzDroop = 4;`
     */
    public fun clearPctHzDroop() {
      _builder.clearPctHzDroop()
    }
    /**
     * ```
     * Black start enable
     * ```
     *
     * `.google.protobuf.FloatValue pctHzDroop = 4;`
     * @return Whether the pctHzDroop field is set.
     */
    public fun hasPctHzDroop(): kotlin.Boolean {
      return _builder.hasPctHzDroop()
    }

    /**
     * ```
     * Black start enable
     * ```
     *
     * `.google.protobuf.FloatValue pctVDroop = 5;`
     */
    public var pctVDroop: com.google.protobuf.FloatValue
      @JvmName("getPctVDroop")
      get() = _builder.getPctVDroop()
      @JvmName("setPctVDroop")
      set(value) {
        _builder.setPctVDroop(value)
      }
    /**
     * ```
     * Black start enable
     * ```
     *
     * `.google.protobuf.FloatValue pctVDroop = 5;`
     */
    public fun clearPctVDroop() {
      _builder.clearPctVDroop()
    }
    /**
     * ```
     * Black start enable
     * ```
     *
     * `.google.protobuf.FloatValue pctVDroop = 5;`
     * @return Whether the pctVDroop field is set.
     */
    public fun hasPctVDroop(): kotlin.Boolean {
      return _builder.hasPctVDroop()
    }

    /**
     * ```
     * Ramp rates
     * ```
     *
     * `.commonmodule.RampRate rampRates = 6;`
     */
    public var rampRates: openfmb.commonmodule.RampRate
      @JvmName("getRampRates")
      get() = _builder.getRampRates()
      @JvmName("setRampRates")
      set(value) {
        _builder.setRampRates(value)
      }
    /**
     * ```
     * Ramp rates
     * ```
     *
     * `.commonmodule.RampRate rampRates = 6;`
     */
    public fun clearRampRates() {
      _builder.clearRampRates()
    }
    /**
     * ```
     * Ramp rates
     * ```
     *
     * `.commonmodule.RampRate rampRates = 6;`
     * @return Whether the rampRates field is set.
     */
    public fun hasRampRates(): kotlin.Boolean {
      return _builder.hasRampRates()
    }

    /**
     * ```
     * Enable reactive power set point
     * ```
     *
     * `.commonmodule.ControlSPC reactivePwrSetPointEnabled = 7;`
     */
    public var reactivePwrSetPointEnabled: openfmb.commonmodule.ControlSPC
      @JvmName("getReactivePwrSetPointEnabled")
      get() = _builder.getReactivePwrSetPointEnabled()
      @JvmName("setReactivePwrSetPointEnabled")
      set(value) {
        _builder.setReactivePwrSetPointEnabled(value)
      }
    /**
     * ```
     * Enable reactive power set point
     * ```
     *
     * `.commonmodule.ControlSPC reactivePwrSetPointEnabled = 7;`
     */
    public fun clearReactivePwrSetPointEnabled() {
      _builder.clearReactivePwrSetPointEnabled()
    }
    /**
     * ```
     * Enable reactive power set point
     * ```
     *
     * `.commonmodule.ControlSPC reactivePwrSetPointEnabled = 7;`
     * @return Whether the reactivePwrSetPointEnabled field is set.
     */
    public fun hasReactivePwrSetPointEnabled(): kotlin.Boolean {
      return _builder.hasReactivePwrSetPointEnabled()
    }

    /**
     * ```
     * Enable real power set point
     * ```
     *
     * `.commonmodule.ControlSPC realPwrSetPointEnabled = 8;`
     */
    public var realPwrSetPointEnabled: openfmb.commonmodule.ControlSPC
      @JvmName("getRealPwrSetPointEnabled")
      get() = _builder.getRealPwrSetPointEnabled()
      @JvmName("setRealPwrSetPointEnabled")
      set(value) {
        _builder.setRealPwrSetPointEnabled(value)
      }
    /**
     * ```
     * Enable real power set point
     * ```
     *
     * `.commonmodule.ControlSPC realPwrSetPointEnabled = 8;`
     */
    public fun clearRealPwrSetPointEnabled() {
      _builder.clearRealPwrSetPointEnabled()
    }
    /**
     * ```
     * Enable real power set point
     * ```
     *
     * `.commonmodule.ControlSPC realPwrSetPointEnabled = 8;`
     * @return Whether the realPwrSetPointEnabled field is set.
     */
    public fun hasRealPwrSetPointEnabled(): kotlin.Boolean {
      return _builder.hasRealPwrSetPointEnabled()
    }

    /**
     * ```
     * Enable voltage set point
     * ```
     *
     * `.commonmodule.ControlSPC voltageSetPointEnabled = 9;`
     */
    public var voltageSetPointEnabled: openfmb.commonmodule.ControlSPC
      @JvmName("getVoltageSetPointEnabled")
      get() = _builder.getVoltageSetPointEnabled()
      @JvmName("setVoltageSetPointEnabled")
      set(value) {
        _builder.setVoltageSetPointEnabled(value)
      }
    /**
     * ```
     * Enable voltage set point
     * ```
     *
     * `.commonmodule.ControlSPC voltageSetPointEnabled = 9;`
     */
    public fun clearVoltageSetPointEnabled() {
      _builder.clearVoltageSetPointEnabled()
    }
    /**
     * ```
     * Enable voltage set point
     * ```
     *
     * `.commonmodule.ControlSPC voltageSetPointEnabled = 9;`
     * @return Whether the voltageSetPointEnabled field is set.
     */
    public fun hasVoltageSetPointEnabled(): kotlin.Boolean {
      return _builder.hasVoltageSetPointEnabled()
    }

    /**
     * ```
     * Start time
     * ```
     *
     * `.commonmodule.Timestamp startTime = 10 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var startTime: openfmb.commonmodule.Timestamp
      @JvmName("getStartTime")
      get() = _builder.getStartTime()
      @JvmName("setStartTime")
      set(value) {
        _builder.setStartTime(value)
      }
    /**
     * ```
     * Start time
     * ```
     *
     * `.commonmodule.Timestamp startTime = 10 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearStartTime() {
      _builder.clearStartTime()
    }
    /**
     * ```
     * Start time
     * ```
     *
     * `.commonmodule.Timestamp startTime = 10 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the startTime field is set.
     */
    public fun hasStartTime(): kotlin.Boolean {
      return _builder.hasStartTime()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.interconnectionmodule.InterconnectionPoint.copy(block: openfmb.interconnectionmodule.InterconnectionPointKt.Dsl.() -> kotlin.Unit): openfmb.interconnectionmodule.InterconnectionPoint =
  openfmb.interconnectionmodule.InterconnectionPointKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.interconnectionmodule.InterconnectionPointOrBuilder.blackStartEnabledOrNull: openfmb.commonmodule.ControlSPC?
  get() = if (hasBlackStartEnabled()) getBlackStartEnabled() else null

public val openfmb.interconnectionmodule.InterconnectionPointOrBuilder.frequencySetPointEnabledOrNull: openfmb.commonmodule.ControlSPC?
  get() = if (hasFrequencySetPointEnabled()) getFrequencySetPointEnabled() else null

public val openfmb.interconnectionmodule.InterconnectionPointOrBuilder.islandOrNull: openfmb.commonmodule.ControlSPC?
  get() = if (hasIsland()) getIsland() else null

public val openfmb.interconnectionmodule.InterconnectionPointOrBuilder.pctHzDroopOrNull: com.google.protobuf.FloatValue?
  get() = if (hasPctHzDroop()) getPctHzDroop() else null

public val openfmb.interconnectionmodule.InterconnectionPointOrBuilder.pctVDroopOrNull: com.google.protobuf.FloatValue?
  get() = if (hasPctVDroop()) getPctVDroop() else null

public val openfmb.interconnectionmodule.InterconnectionPointOrBuilder.rampRatesOrNull: openfmb.commonmodule.RampRate?
  get() = if (hasRampRates()) getRampRates() else null

public val openfmb.interconnectionmodule.InterconnectionPointOrBuilder.reactivePwrSetPointEnabledOrNull: openfmb.commonmodule.ControlSPC?
  get() = if (hasReactivePwrSetPointEnabled()) getReactivePwrSetPointEnabled() else null

public val openfmb.interconnectionmodule.InterconnectionPointOrBuilder.realPwrSetPointEnabledOrNull: openfmb.commonmodule.ControlSPC?
  get() = if (hasRealPwrSetPointEnabled()) getRealPwrSetPointEnabled() else null

public val openfmb.interconnectionmodule.InterconnectionPointOrBuilder.voltageSetPointEnabledOrNull: openfmb.commonmodule.ControlSPC?
  get() = if (hasVoltageSetPointEnabled()) getVoltageSetPointEnabled() else null

public val openfmb.interconnectionmodule.InterconnectionPointOrBuilder.startTimeOrNull: openfmb.commonmodule.Timestamp?
  get() = if (hasStartTime()) getStartTime() else null

