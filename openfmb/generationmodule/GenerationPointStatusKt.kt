// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: generationmodule/generationmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.generationmodule;

@kotlin.jvm.JvmName("-initializegenerationPointStatus")
public inline fun generationPointStatus(block: openfmb.generationmodule.GenerationPointStatusKt.Dsl.() -> kotlin.Unit): openfmb.generationmodule.GenerationPointStatus =
  openfmb.generationmodule.GenerationPointStatusKt.Dsl._create(openfmb.generationmodule.GenerationPointStatus.newBuilder()).apply { block() }._build()
/**
 * ```
 * Point definition (Point)
 * ```
 *
 * Protobuf type `generationmodule.GenerationPointStatus`
 */
public object GenerationPointStatusKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.generationmodule.GenerationPointStatus.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.generationmodule.GenerationPointStatus.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.generationmodule.GenerationPointStatus = _builder.build()

    /**
     * ```
     * Black start enable
     * ```
     *
     * `.commonmodule.StatusSPS blackStartEnabled = 1;`
     */
    public var blackStartEnabled: openfmb.commonmodule.StatusSPS
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
     * `.commonmodule.StatusSPS blackStartEnabled = 1;`
     */
    public fun clearBlackStartEnabled() {
      _builder.clearBlackStartEnabled()
    }
    /**
     * ```
     * Black start enable
     * ```
     *
     * `.commonmodule.StatusSPS blackStartEnabled = 1;`
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
     * `.commonmodule.StatusSPS frequencySetPointEnabled = 2;`
     */
    public var frequencySetPointEnabled: openfmb.commonmodule.StatusSPS
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
     * `.commonmodule.StatusSPS frequencySetPointEnabled = 2;`
     */
    public fun clearFrequencySetPointEnabled() {
      _builder.clearFrequencySetPointEnabled()
    }
    /**
     * ```
     * Enable frequency set point
     * ```
     *
     * `.commonmodule.StatusSPS frequencySetPointEnabled = 2;`
     * @return Whether the frequencySetPointEnabled field is set.
     */
    public fun hasFrequencySetPointEnabled(): kotlin.Boolean {
      return _builder.hasFrequencySetPointEnabled()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.FloatValue pctHzDroop = 3;`
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
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.FloatValue pctHzDroop = 3;`
     */
    public fun clearPctHzDroop() {
      _builder.clearPctHzDroop()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.FloatValue pctHzDroop = 3;`
     * @return Whether the pctHzDroop field is set.
     */
    public fun hasPctHzDroop(): kotlin.Boolean {
      return _builder.hasPctHzDroop()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.FloatValue pctVDroop = 4;`
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
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.FloatValue pctVDroop = 4;`
     */
    public fun clearPctVDroop() {
      _builder.clearPctVDroop()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.google.protobuf.FloatValue pctVDroop = 4;`
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
     * `.commonmodule.RampRate rampRates = 5;`
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
     * `.commonmodule.RampRate rampRates = 5;`
     */
    public fun clearRampRates() {
      _builder.clearRampRates()
    }
    /**
     * ```
     * Ramp rates
     * ```
     *
     * `.commonmodule.RampRate rampRates = 5;`
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
     * `.commonmodule.StatusSPS reactivePwrSetPointEnabled = 6;`
     */
    public var reactivePwrSetPointEnabled: openfmb.commonmodule.StatusSPS
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
     * `.commonmodule.StatusSPS reactivePwrSetPointEnabled = 6;`
     */
    public fun clearReactivePwrSetPointEnabled() {
      _builder.clearReactivePwrSetPointEnabled()
    }
    /**
     * ```
     * Enable reactive power set point
     * ```
     *
     * `.commonmodule.StatusSPS reactivePwrSetPointEnabled = 6;`
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
     * `.commonmodule.StatusSPS realPwrSetPointEnabled = 7;`
     */
    public var realPwrSetPointEnabled: openfmb.commonmodule.StatusSPS
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
     * `.commonmodule.StatusSPS realPwrSetPointEnabled = 7;`
     */
    public fun clearRealPwrSetPointEnabled() {
      _builder.clearRealPwrSetPointEnabled()
    }
    /**
     * ```
     * Enable real power set point
     * ```
     *
     * `.commonmodule.StatusSPS realPwrSetPointEnabled = 7;`
     * @return Whether the realPwrSetPointEnabled field is set.
     */
    public fun hasRealPwrSetPointEnabled(): kotlin.Boolean {
      return _builder.hasRealPwrSetPointEnabled()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.Optional_StateKind state = 8;`
     */
    public var state: openfmb.commonmodule.Optional_StateKind
      @JvmName("getState")
      get() = _builder.getState()
      @JvmName("setState")
      set(value) {
        _builder.setState(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.Optional_StateKind state = 8;`
     */
    public fun clearState() {
      _builder.clearState()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.Optional_StateKind state = 8;`
     * @return Whether the state field is set.
     */
    public fun hasState(): kotlin.Boolean {
      return _builder.hasState()
    }

    /**
     * ```
     * Synchronize back to grid
     * ```
     *
     * `.commonmodule.StatusSPS syncBackToGrid = 9;`
     */
    public var syncBackToGrid: openfmb.commonmodule.StatusSPS
      @JvmName("getSyncBackToGrid")
      get() = _builder.getSyncBackToGrid()
      @JvmName("setSyncBackToGrid")
      set(value) {
        _builder.setSyncBackToGrid(value)
      }
    /**
     * ```
     * Synchronize back to grid
     * ```
     *
     * `.commonmodule.StatusSPS syncBackToGrid = 9;`
     */
    public fun clearSyncBackToGrid() {
      _builder.clearSyncBackToGrid()
    }
    /**
     * ```
     * Synchronize back to grid
     * ```
     *
     * `.commonmodule.StatusSPS syncBackToGrid = 9;`
     * @return Whether the syncBackToGrid field is set.
     */
    public fun hasSyncBackToGrid(): kotlin.Boolean {
      return _builder.hasSyncBackToGrid()
    }

    /**
     * ```
     * Transition to island on grid loss enable
     * ```
     *
     * `.commonmodule.StatusSPS transToIslndOnGridLossEnabled = 10;`
     */
    public var transToIslndOnGridLossEnabled: openfmb.commonmodule.StatusSPS
      @JvmName("getTransToIslndOnGridLossEnabled")
      get() = _builder.getTransToIslndOnGridLossEnabled()
      @JvmName("setTransToIslndOnGridLossEnabled")
      set(value) {
        _builder.setTransToIslndOnGridLossEnabled(value)
      }
    /**
     * ```
     * Transition to island on grid loss enable
     * ```
     *
     * `.commonmodule.StatusSPS transToIslndOnGridLossEnabled = 10;`
     */
    public fun clearTransToIslndOnGridLossEnabled() {
      _builder.clearTransToIslndOnGridLossEnabled()
    }
    /**
     * ```
     * Transition to island on grid loss enable
     * ```
     *
     * `.commonmodule.StatusSPS transToIslndOnGridLossEnabled = 10;`
     * @return Whether the transToIslndOnGridLossEnabled field is set.
     */
    public fun hasTransToIslndOnGridLossEnabled(): kotlin.Boolean {
      return _builder.hasTransToIslndOnGridLossEnabled()
    }

    /**
     * ```
     * Enable voltage set point
     * ```
     *
     * `.commonmodule.StatusSPS voltageSetPointEnabled = 11;`
     */
    public var voltageSetPointEnabled: openfmb.commonmodule.StatusSPS
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
     * `.commonmodule.StatusSPS voltageSetPointEnabled = 11;`
     */
    public fun clearVoltageSetPointEnabled() {
      _builder.clearVoltageSetPointEnabled()
    }
    /**
     * ```
     * Enable voltage set point
     * ```
     *
     * `.commonmodule.StatusSPS voltageSetPointEnabled = 11;`
     * @return Whether the voltageSetPointEnabled field is set.
     */
    public fun hasVoltageSetPointEnabled(): kotlin.Boolean {
      return _builder.hasVoltageSetPointEnabled()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.EnterServiceAPC enterServiceOperation = 12;`
     */
    public var enterServiceOperation: openfmb.commonmodule.EnterServiceAPC
      @JvmName("getEnterServiceOperation")
      get() = _builder.getEnterServiceOperation()
      @JvmName("setEnterServiceOperation")
      set(value) {
        _builder.setEnterServiceOperation(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.EnterServiceAPC enterServiceOperation = 12;`
     */
    public fun clearEnterServiceOperation() {
      _builder.clearEnterServiceOperation()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.EnterServiceAPC enterServiceOperation = 12;`
     * @return Whether the enterServiceOperation field is set.
     */
    public fun hasEnterServiceOperation(): kotlin.Boolean {
      return _builder.hasEnterServiceOperation()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.HzWAPC hzWOperation = 13;`
     */
    public var hzWOperation: openfmb.commonmodule.HzWAPC
      @JvmName("getHzWOperation")
      get() = _builder.getHzWOperation()
      @JvmName("setHzWOperation")
      set(value) {
        _builder.setHzWOperation(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.HzWAPC hzWOperation = 13;`
     */
    public fun clearHzWOperation() {
      _builder.clearHzWOperation()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.HzWAPC hzWOperation = 13;`
     * @return Whether the hzWOperation field is set.
     */
    public fun hasHzWOperation(): kotlin.Boolean {
      return _builder.hasHzWOperation()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.LimitWAPC limitWOperation = 14;`
     */
    public var limitWOperation: openfmb.commonmodule.LimitWAPC
      @JvmName("getLimitWOperation")
      get() = _builder.getLimitWOperation()
      @JvmName("setLimitWOperation")
      set(value) {
        _builder.setLimitWOperation(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.LimitWAPC limitWOperation = 14;`
     */
    public fun clearLimitWOperation() {
      _builder.clearLimitWOperation()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.LimitWAPC limitWOperation = 14;`
     * @return Whether the limitWOperation field is set.
     */
    public fun hasLimitWOperation(): kotlin.Boolean {
      return _builder.hasLimitWOperation()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PFSPC pFOperation = 15;`
     */
    public var pFOperation: openfmb.commonmodule.PFSPC
      @JvmName("getPFOperation")
      get() = _builder.getPFOperation()
      @JvmName("setPFOperation")
      set(value) {
        _builder.setPFOperation(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PFSPC pFOperation = 15;`
     */
    public fun clearPFOperation() {
      _builder.clearPFOperation()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PFSPC pFOperation = 15;`
     * @return Whether the pFOperation field is set.
     */
    public fun hasPFOperation(): kotlin.Boolean {
      return _builder.hasPFOperation()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.TmHzCSG tmHzTripOperation = 16;`
     */
    public var tmHzTripOperation: openfmb.commonmodule.TmHzCSG
      @JvmName("getTmHzTripOperation")
      get() = _builder.getTmHzTripOperation()
      @JvmName("setTmHzTripOperation")
      set(value) {
        _builder.setTmHzTripOperation(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.TmHzCSG tmHzTripOperation = 16;`
     */
    public fun clearTmHzTripOperation() {
      _builder.clearTmHzTripOperation()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.TmHzCSG tmHzTripOperation = 16;`
     * @return Whether the tmHzTripOperation field is set.
     */
    public fun hasTmHzTripOperation(): kotlin.Boolean {
      return _builder.hasTmHzTripOperation()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.TmVoltCSG tmVoltTripOperation = 17;`
     */
    public var tmVoltTripOperation: openfmb.commonmodule.TmVoltCSG
      @JvmName("getTmVoltTripOperation")
      get() = _builder.getTmVoltTripOperation()
      @JvmName("setTmVoltTripOperation")
      set(value) {
        _builder.setTmVoltTripOperation(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.TmVoltCSG tmVoltTripOperation = 17;`
     */
    public fun clearTmVoltTripOperation() {
      _builder.clearTmVoltTripOperation()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.TmVoltCSG tmVoltTripOperation = 17;`
     * @return Whether the tmVoltTripOperation field is set.
     */
    public fun hasTmVoltTripOperation(): kotlin.Boolean {
      return _builder.hasTmVoltTripOperation()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.VarSPC vArOperation = 18;`
     */
    public var vArOperation: openfmb.commonmodule.VarSPC
      @JvmName("getVArOperation")
      get() = _builder.getVArOperation()
      @JvmName("setVArOperation")
      set(value) {
        _builder.setVArOperation(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.VarSPC vArOperation = 18;`
     */
    public fun clearVArOperation() {
      _builder.clearVArOperation()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.VarSPC vArOperation = 18;`
     * @return Whether the vArOperation field is set.
     */
    public fun hasVArOperation(): kotlin.Boolean {
      return _builder.hasVArOperation()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.VoltVarCSG voltVarOperation = 19;`
     */
    public var voltVarOperation: openfmb.commonmodule.VoltVarCSG
      @JvmName("getVoltVarOperation")
      get() = _builder.getVoltVarOperation()
      @JvmName("setVoltVarOperation")
      set(value) {
        _builder.setVoltVarOperation(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.VoltVarCSG voltVarOperation = 19;`
     */
    public fun clearVoltVarOperation() {
      _builder.clearVoltVarOperation()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.VoltVarCSG voltVarOperation = 19;`
     * @return Whether the voltVarOperation field is set.
     */
    public fun hasVoltVarOperation(): kotlin.Boolean {
      return _builder.hasVoltVarOperation()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.VoltWCSG voltWOperation = 20;`
     */
    public var voltWOperation: openfmb.commonmodule.VoltWCSG
      @JvmName("getVoltWOperation")
      get() = _builder.getVoltWOperation()
      @JvmName("setVoltWOperation")
      set(value) {
        _builder.setVoltWOperation(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.VoltWCSG voltWOperation = 20;`
     */
    public fun clearVoltWOperation() {
      _builder.clearVoltWOperation()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.VoltWCSG voltWOperation = 20;`
     * @return Whether the voltWOperation field is set.
     */
    public fun hasVoltWOperation(): kotlin.Boolean {
      return _builder.hasVoltWOperation()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.WVarCSG wVarOperation = 21;`
     */
    public var wVarOperation: openfmb.commonmodule.WVarCSG
      @JvmName("getWVarOperation")
      get() = _builder.getWVarOperation()
      @JvmName("setWVarOperation")
      set(value) {
        _builder.setWVarOperation(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.WVarCSG wVarOperation = 21;`
     */
    public fun clearWVarOperation() {
      _builder.clearWVarOperation()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.WVarCSG wVarOperation = 21;`
     * @return Whether the wVarOperation field is set.
     */
    public fun hasWVarOperation(): kotlin.Boolean {
      return _builder.hasWVarOperation()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.generationmodule.GenerationPointStatus.copy(block: openfmb.generationmodule.GenerationPointStatusKt.Dsl.() -> kotlin.Unit): openfmb.generationmodule.GenerationPointStatus =
  openfmb.generationmodule.GenerationPointStatusKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.blackStartEnabledOrNull: openfmb.commonmodule.StatusSPS?
  get() = if (hasBlackStartEnabled()) getBlackStartEnabled() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.frequencySetPointEnabledOrNull: openfmb.commonmodule.StatusSPS?
  get() = if (hasFrequencySetPointEnabled()) getFrequencySetPointEnabled() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.pctHzDroopOrNull: com.google.protobuf.FloatValue?
  get() = if (hasPctHzDroop()) getPctHzDroop() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.pctVDroopOrNull: com.google.protobuf.FloatValue?
  get() = if (hasPctVDroop()) getPctVDroop() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.rampRatesOrNull: openfmb.commonmodule.RampRate?
  get() = if (hasRampRates()) getRampRates() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.reactivePwrSetPointEnabledOrNull: openfmb.commonmodule.StatusSPS?
  get() = if (hasReactivePwrSetPointEnabled()) getReactivePwrSetPointEnabled() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.realPwrSetPointEnabledOrNull: openfmb.commonmodule.StatusSPS?
  get() = if (hasRealPwrSetPointEnabled()) getRealPwrSetPointEnabled() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.stateOrNull: openfmb.commonmodule.Optional_StateKind?
  get() = if (hasState()) getState() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.syncBackToGridOrNull: openfmb.commonmodule.StatusSPS?
  get() = if (hasSyncBackToGrid()) getSyncBackToGrid() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.transToIslndOnGridLossEnabledOrNull: openfmb.commonmodule.StatusSPS?
  get() = if (hasTransToIslndOnGridLossEnabled()) getTransToIslndOnGridLossEnabled() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.voltageSetPointEnabledOrNull: openfmb.commonmodule.StatusSPS?
  get() = if (hasVoltageSetPointEnabled()) getVoltageSetPointEnabled() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.enterServiceOperationOrNull: openfmb.commonmodule.EnterServiceAPC?
  get() = if (hasEnterServiceOperation()) getEnterServiceOperation() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.hzWOperationOrNull: openfmb.commonmodule.HzWAPC?
  get() = if (hasHzWOperation()) getHzWOperation() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.limitWOperationOrNull: openfmb.commonmodule.LimitWAPC?
  get() = if (hasLimitWOperation()) getLimitWOperation() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.pFOperationOrNull: openfmb.commonmodule.PFSPC?
  get() = if (hasPFOperation()) getPFOperation() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.tmHzTripOperationOrNull: openfmb.commonmodule.TmHzCSG?
  get() = if (hasTmHzTripOperation()) getTmHzTripOperation() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.tmVoltTripOperationOrNull: openfmb.commonmodule.TmVoltCSG?
  get() = if (hasTmVoltTripOperation()) getTmVoltTripOperation() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.vArOperationOrNull: openfmb.commonmodule.VarSPC?
  get() = if (hasVArOperation()) getVArOperation() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.voltVarOperationOrNull: openfmb.commonmodule.VoltVarCSG?
  get() = if (hasVoltVarOperation()) getVoltVarOperation() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.voltWOperationOrNull: openfmb.commonmodule.VoltWCSG?
  get() = if (hasVoltWOperation()) getVoltWOperation() else null

public val openfmb.generationmodule.GenerationPointStatusOrBuilder.wVarOperationOrNull: openfmb.commonmodule.WVarCSG?
  get() = if (hasWVarOperation()) getWVarOperation() else null

